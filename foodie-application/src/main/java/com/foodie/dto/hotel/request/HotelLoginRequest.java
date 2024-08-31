package com.foodie.dto.hotel.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelLoginRequest {
    private String loginId;
    private String password;
}
