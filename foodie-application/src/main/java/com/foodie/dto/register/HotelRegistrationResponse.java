package com.foodie.dto.register;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotelRegistrationResponse {
    private String statusCode;
    private String statusMessage;
    private boolean success;
    private String message;
}
