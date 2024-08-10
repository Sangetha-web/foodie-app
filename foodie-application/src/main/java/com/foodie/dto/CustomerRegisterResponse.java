package com.foodie.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRegisterResponse {
    private String statusCode;
    private String statusMessage;
    private boolean success;
    private String message;
}
