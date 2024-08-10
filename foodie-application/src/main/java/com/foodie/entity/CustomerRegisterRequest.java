package com.foodie.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Customer_information")
public class CustomerRegisterRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String custId;

    @Column(name = "customer_name")
    private String custName;

    @Column(name = "customer_phn")
    private String custPhn;

    @Column(name = "customer_email")
    private String email;

    @Column(name = "customer_addresss")
    private String custAddress;

    @Column(name = "customer_password")
    private String password;

}
