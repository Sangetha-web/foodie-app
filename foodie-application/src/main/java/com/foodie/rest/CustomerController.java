//package com.foodie.rest;
//
//import com.foodie.dto.CustomerRegisterResponse;
//import com.foodie.entity.CustomerRegisterRequest;
//import com.foodie.repository.CustomerRepository;
//import com.foodie.service.CustomerService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@CrossOrigin("http://localhost:4200/")
//public class CustomerController {
//
//    private static final Logger log = LoggerFactory.getLogger(CustomerController.class);
//    @Autowired
//    private CustomerService customerService;
//
//
//    private CustomerRegisterResponse customerRegisterResponse;
//
//    @PostMapping("/register/custReg")
//    public CustomerRegisterResponse saveCustomerInformation(@RequestBody CustomerRegisterRequest customer) {
//        customerRegisterResponse = this.customerService.saveCustomerInformation(customer);
//        return customerRegisterResponse;
//    }
//
//
//
//
//}
