package com.foodie.entity.register;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Customer_information")
public class HotelRegistrationRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="db_id")
    private Long dbId;

    @Column(name="hotel_id")
    private String hotelId;
    @Column(name= "hotel_name")
    private String hotelName;
    @Column(name = "hotel_email")
    private String hotelEmail;
    @Column(name="hotel_type")
    private String hotelType;
    @Column(name="phone_number")
    private Long phoneNumber;
    @Column(name="password")
    private String password;
    @Column(name="address")
    private String address;
    @Column(name="city")
    private String city;
    @Column(name="state")
    private String state;
    @Column(name="zip")
    private String zip;
}
