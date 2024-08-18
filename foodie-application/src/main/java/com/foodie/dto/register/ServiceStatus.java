package com.foodie.dto.register;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceStatus {
    private boolean success;
    private String message;
    private String statusCode;
    private String statusMessage;
}
