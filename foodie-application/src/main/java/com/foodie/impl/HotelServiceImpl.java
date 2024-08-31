package com.foodie.impl;

import com.foodie.constants.Constant;
import com.foodie.dto.hotel.HotelDetails;
import com.foodie.dto.hotel.request.HotelLoginRequest;
import com.foodie.dto.hotel.response.HotelLoginResponse;
import com.foodie.dto.register.HotelRegistrationResponse;
import com.foodie.entity.register.HotelRegistrationRequest;
import com.foodie.repository.HotelRepository;
import com.foodie.service.HotelService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;


    @Override
    public HotelRegistrationResponse saveHotelRegistration(HotelRegistrationRequest hotelRegistrationRequest) {
        HotelRegistrationResponse hotelRegistrationResponse = new HotelRegistrationResponse();
        try {
            this.hotelRepository.save(hotelRegistrationRequest);
            generateHotelId(hotelRegistrationRequest);
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

    @Override
    public HotelLoginResponse validateHotelLoginbyPhoneNumberREmailNumber(HotelLoginRequest loginRequest) {
        HotelLoginResponse hotelLoginResponse = new HotelLoginResponse();
        HotelDetails hotelDetails = new HotelDetails();
        try {
            HotelRegistrationRequest requestFromDB = hotelRepository.findByLoginIdAndPassword(loginRequest.getLoginId(), loginRequest.getPassword());
            if (requestFromDB != null) {
                hotelLoginResponse.setIsValid(true);
                Long dbId = requestFromDB.getDbId();
                hotelDetails = hotelRepository.findByDbId(dbId);
                hotelLoginResponse.setStatusCode(Constant.STATUS_CODE_200);
                hotelLoginResponse.setSuccess(Constant.STATUS_SUCCESS);
                hotelLoginResponse.setMessage(Constant.HOTEL_RETRIEVE_SUCCESS_MESSAGE);
                hotelLoginResponse.setStatusMessage(Constant.STATUS_MSG_SUCCESS);
                hotelLoginResponse.setHotelDetails(hotelDetails);
            } else {
                hotelLoginResponse.setIsValid(false);
            }
        } catch (Exception e) {
            throw new RuntimeException("Error occurred while login" + e.getMessage());
        }
        return hotelLoginResponse;
    }

    @Transactional
    public void generateHotelId(HotelRegistrationRequest hotel) {
        if (hotel.getDbId() != null) {
            String hotelId = "HOT" + String.format("%03d", hotel.getDbId());
            this.hotelRepository.generateAndUpdateHotelId(hotel.getDbId(), hotelId);
        }
    }
}
