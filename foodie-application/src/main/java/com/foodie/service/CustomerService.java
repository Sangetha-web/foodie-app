package com.foodie.service;

import com.foodie.dto.CustomerRegisterResponse;
import com.foodie.entity.CustomerRegisterRequest;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    CustomerRegisterResponse saveCustomerInformation(CustomerRegisterRequest customerRegisterRequest);

}
