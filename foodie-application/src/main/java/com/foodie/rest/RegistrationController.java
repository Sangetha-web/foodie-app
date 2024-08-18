package com.foodie.rest;

import com.foodie.dto.register.CustomerRegisterResponse;
import com.foodie.dto.register.HotelRegistrationResponse;
import com.foodie.entity.register.CustomerRegisterRequest;
import com.foodie.entity.register.HotelRegistrationRequest;
import com.foodie.service.CustomerService;
import com.foodie.service.HotelService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
@CrossOrigin("http://localhost:4200/")
public class RegistrationController {


    @Autowired
    private CustomerService customerService;

    @Autowired
    private HotelService hotelService;

    private CustomerRegisterResponse customerRegisterResponse;

    private HotelRegistrationResponse hotelRegistrationResponse;

    @PostMapping("/custReg")
    public CustomerRegisterResponse saveCustomerInformation(@RequestBody @Valid CustomerRegisterRequest customer) {
        customerRegisterResponse = this.customerService.saveCustomerInformation(customer);
        return customerRegisterResponse;
    }

    @PostMapping("/hotel-reg")
    public HotelRegistrationResponse saveHotelRegistration(@RequestBody HotelRegistrationRequest hotelRegistrationRequest) {
        hotelRegistrationResponse = hotelService.saveHotelRegistration(hotelRegistrationRequest);
        return hotelRegistrationResponse;
    }




}
