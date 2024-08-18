package com.foodie.service;

import com.foodie.dto.hotel.HotelLoginRequest;
import com.foodie.dto.hotel.HotelLoginResponse;
import com.foodie.dto.register.HotelRegistrationResponse;
import com.foodie.entity.register.HotelRegistrationRequest;
import org.springframework.stereotype.Service;

@Service
public interface HotelService {
    HotelRegistrationResponse saveHotelRegistration(HotelRegistrationRequest hotelRegistrationRequest);
    HotelLoginResponse validateHotelLoginbyPhoneNumberREmailNumber(HotelLoginRequest loginRequest);
}
