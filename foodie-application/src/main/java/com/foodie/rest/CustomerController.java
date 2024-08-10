package com.foodie.rest;

import com.foodie.dto.CustomerRegisterResponse;
import com.foodie.entity.CustomerRegisterRequest;
import com.foodie.repository.CustomerRepository;
import com.foodie.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cust")
public class CustomerController {

    private static final Logger log = LoggerFactory.getLogger(CustomerController.class);
    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerRegisterResponse customerRegisterResponse;

   // @GetMapping("/register")
//    public CustomerRegisterResponse saveCustomerInformation(@RequestBody CustomerRegisterRequest customer) {
//        customerRegisterResponse = customerService.saveCustomerInformation(customer);
//        return customerRegisterResponse;
//    }
    @GetMapping("/hello")
     public String msg() {
    	 return "Hello World";
    }



}
