package com.foodie.dto.hotel;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HotelDetails {

    private String hotelId;
    private String hotelName;
    private String hotelEmail;
    private String hotelType;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private String zipCode;
}
