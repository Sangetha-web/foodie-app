package com.foodie.service;

import com.foodie.dto.CustomerRegisterResponse;
import com.foodie.entity.CustomerRegisterRequest;
<<<<<<< HEAD
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
=======
>>>>>>> 33fd96b86e06dc3269ff4b17c14fc8c20c9355be
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    CustomerRegisterResponse saveCustomerInformation(CustomerRegisterRequest customerRegisterRequest);

}
