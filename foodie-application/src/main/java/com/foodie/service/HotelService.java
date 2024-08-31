package com.foodie.service;

import com.foodie.dto.hotel.request.HotelLoginRequest;
import com.foodie.dto.hotel.response.HotelLoginResponse;
import com.foodie.dto.register.HotelRegistrationResponse;
import com.foodie.entity.register.HotelRegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public interface HotelService {
    HotelRegistrationResponse saveHotelRegistration(HotelRegistrationRequest hotelRegistrationRequest);
    HotelLoginResponse validateHotelLoginbyPhoneNumberREmailNumber(HotelLoginRequest loginRequest);

}
