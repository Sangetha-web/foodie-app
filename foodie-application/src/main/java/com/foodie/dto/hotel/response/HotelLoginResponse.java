package com.foodie.dto.hotel.response;

import com.foodie.dto.hotel.HotelDetails;
import com.foodie.dto.register.ServiceStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelLoginResponse extends ServiceStatus {
    private HotelDetails hotelDetails;
    private Boolean isValid;
}
