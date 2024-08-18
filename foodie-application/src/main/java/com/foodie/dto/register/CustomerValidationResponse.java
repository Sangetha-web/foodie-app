package com.foodie.dto.register;
import lombok.Data;


@Data

public class CustomerValidationResponse extends ServiceStatus{
    private boolean isValidUser;
}
