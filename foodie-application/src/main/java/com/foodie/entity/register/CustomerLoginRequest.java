package com.foodie.entity.register;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
public class CustomerLoginRequest {
    private String loginId;
    private String password;
}
