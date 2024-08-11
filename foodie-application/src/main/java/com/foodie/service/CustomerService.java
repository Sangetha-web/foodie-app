package com.foodie.service;

import com.foodie.dto.CustomerRegisterResponse;
import com.foodie.entity.CustomerRegisterRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public interface CustomerService {
    CustomerRegisterResponse saveCustomerInformation(CustomerRegisterRequest customerRegisterRequest);

}
