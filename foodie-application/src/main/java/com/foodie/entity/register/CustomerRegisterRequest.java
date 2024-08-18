package com.foodie.entity.register;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Customer_information")
@Data
public class CustomerRegisterRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dbId;

    @Column(name="cust_id")
    private String custID;

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
