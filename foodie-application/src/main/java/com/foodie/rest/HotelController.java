package com.foodie.rest;

import com.foodie.dto.hotel.request.HotelLoginRequest;
import com.foodie.dto.hotel.response.HotelLoginResponse;
import com.foodie.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping("/login")
    public HotelLoginResponse ValidateHotelLogin(@RequestBody HotelLoginRequest loginRequest){
        HotelLoginResponse hotelLoginResponse = new HotelLoginResponse();
        hotelLoginResponse = hotelService.validateHotelLoginbyPhoneNumberREmailNumber(loginRequest);
        return hotelLoginResponse;
    }

}
