package com.foodie.repository;

import com.foodie.entity.register.CustomerRegisterRequest;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerRegisterRequest, Long> {
    @Modifying
    @Transactional
    @Query("update CustomerRegisterRequest cus set cus.custID =:custID where cus.dbId =:dbId")
     void saveFormattedCustID(@Param("custID") String formattedCustId, @Param("dbId") Long dbId);

    @Query("select c from CustomerRegisterRequest c where c.custPhn =:loginId or c.email =:loginId")
    CustomerRegisterRequest getCustInfoForLogin(@Param ("loginId")String loginId);


}



