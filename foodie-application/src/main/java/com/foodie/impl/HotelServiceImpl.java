package com.foodie.impl;

import com.foodie.constants.Constant;
import com.foodie.dto.register.HotelRegistrationResponse;
import com.foodie.entity.register.HotelRegistrationRequest;
import com.foodie.repository.HotelRepository;
import com.foodie.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;

public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepository hotelRepository;


    @Override
    public HotelRegistrationResponse saveHotelRegistration(HotelRegistrationRequest hotelRegistrationRequest) {
        HotelRegistrationResponse hotelRegistrationResponse = new HotelRegistrationResponse();
        try {
            this.hotelRepository.save(hotelRegistrationRequest);
            hotelRegistrationResponse.setStatusCode(Constant.STATUS_CODE_200);
            hotelRegistrationResponse.setSuccess(Constant.STATUS_SUCCESS);
            hotelRegistrationResponse.setMessage(Constant.HOTEL_REGISTRATION_SUCCESS_MESSAGE);
            hotelRegistrationResponse.setStatusMessage(Constant.STATUS_MSG_SUCCESS);
        } catch (Exception e) {
            throw new RuntimeException("Error occured while saving the Hotel data" + e.getMessage());
//            hotelRegistrationResponse.setStatusCode(Constant.STATUS_CODE_500);
//            hotelRegistrationResponse.setSuccess(Constant.STATUS_ERROR);
//            hotelRegistrationResponse.setMessage(e.getMessage());
//            hotelRegistrationResponse.setStatusMessage(Constant.STATUS_MSG_FAILURE);

        }
        return hotelRegistrationResponse;
    }
}
