package com.foodie.impl;

import com.foodie.dto.register.CustomerRegisterResponse;
import com.foodie.dto.register.CustomerValidationResponse;
import com.foodie.entity.register.CustomerLoginRequest;
import com.foodie.entity.register.CustomerRegisterRequest;
import com.foodie.repository.CustomerRepository;
import com.foodie.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerRegisterResponse saveCustomerInformation(CustomerRegisterRequest customer) {
        CustomerRegisterResponse customerRegisterResponse = new CustomerRegisterResponse();
        try {
            this.customerRepository.save(customer);
            generateCustId(customer);
            customerRegisterResponse.setStatusCode("200");
            customerRegisterResponse.setStatusMessage("Success");
            customerRegisterResponse.setSuccess(true);
            customerRegisterResponse.setMessage("Customer information saved successfully!!");

        } catch (Exception exception) {
            throw new RuntimeException("Exception occured while saving customer Information" + exception.getMessage());
        }
        return customerRegisterResponse;
    }

    public void generateCustId(CustomerRegisterRequest customer) {
        String formattedCustId = "CUST" + String.format("%03d", customer.getDbId());
        customerRepository.saveFormattedCustID(formattedCustId, customer.getDbId());
    }

    public CustomerValidationResponse validateCustInfo(CustomerLoginRequest requestLogin) {
        CustomerRegisterRequest request = new CustomerRegisterRequest();
        CustomerValidationResponse response = new CustomerValidationResponse();
        request = customerRepository.getCustInfoForLogin(requestLogin.getLoginId());
        if (request != null) {
            response.setValidUser(true);
            response.setSuccess(true);
            response.setMessage("Login success");
            response.setStatusCode("200");


        } else {
            response.setValidUser(false);
            response.setSuccess(false);
            response.setMessage("Login denied");
            response.setStatusCode("405");
        }
        return response;
    }
}
