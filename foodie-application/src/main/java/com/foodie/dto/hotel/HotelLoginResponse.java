package com.foodie.dto.hotel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelLoginResponse {
    private HotelDetails hotelDetails;
    private Boolean isValid;
}
