package com.foodie.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Table(name = "Customer_information1")
@Data
public class CustomerRegisterRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long custId;

    @Column(name = "customer_name")
    private String custName;

    @Column(name = "customer_phn")
    private String custPhn;

    //@NotNull(message = "Email is required")
    @Column(name = "customer_email")
    private String email;

    @Column(name = "customer_addresss")
    private String custAddress;

    @Column(name = "customer_password")
    private String password;

}
