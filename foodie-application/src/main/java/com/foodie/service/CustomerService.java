package com.foodie.service;

import com.foodie.dto.register.CustomerRegisterResponse;
import com.foodie.dto.register.CustomerValidationResponse;
import com.foodie.entity.register.CustomerLoginRequest;
import com.foodie.entity.register.CustomerRegisterRequest;
import org.springframework.stereotype.Service;


@Service
public interface CustomerService {
    CustomerRegisterResponse saveCustomerInformation(CustomerRegisterRequest customerRegisterRequest);
    CustomerValidationResponse validateCustInfo(CustomerLoginRequest request);

}
