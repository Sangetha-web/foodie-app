package com.foodie.impl;

import com.foodie.dto.CustomerRegisterResponse;
import com.foodie.entity.CustomerRegisterRequest;
import com.foodie.repository.CustomerRepository;
import com.foodie.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerRegisterResponse saveCustomerInformation(CustomerRegisterRequest customer){
        CustomerRegisterResponse customerRegisterResponse = new CustomerRegisterResponse();
        try {
            this.customerRepository.save(customer);
            customerRegisterResponse.setStatusCode("200");
            customerRegisterResponse.setStatusMessage("Success");
            customerRegisterResponse.setSuccess(true);
            customerRegisterResponse.setMessage("Customer information saved successfully!!");

        } catch(Exception exception){
            throw new RuntimeException("Exception occured while saving customer Information" + exception.getMessage());
        }
        return  customerRegisterResponse;
    }
}
