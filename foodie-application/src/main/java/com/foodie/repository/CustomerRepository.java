package com.foodie.repository;

import com.foodie.entity.CustomerRegisterRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerRegisterRequest, String> {

}



