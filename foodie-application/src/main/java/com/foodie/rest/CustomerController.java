package com.foodie.rest;

import com.foodie.dto.register.CustomerRegisterResponse;
import com.foodie.dto.register.CustomerValidationResponse;
import com.foodie.entity.register.CustomerLoginRequest;
import com.foodie.entity.register.CustomerRegisterRequest;
import com.foodie.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/cust")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    private CustomerRegisterResponse customerRegisterResponse;

    @GetMapping("/login")
    public CustomerValidationResponse validateCustLogin(@RequestBody CustomerLoginRequest request) {
        CustomerValidationResponse res = new CustomerValidationResponse();
        res = customerService.validateCustInfo(request);
        return res;
    }

}
