package com.foodie.repository;

import com.foodie.dto.hotel.HotelDetails;
import com.foodie.entity.register.HotelRegistrationRequest;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<HotelRegistrationRequest, Long> {

    // this method update the hotelId in table directly when ever called in the process
    @Modifying //to update specific fields of an entity without fetching the entire entity from the database.
    @Transactional
    @Query("UPDATE HotelRegistrationRequest h SET h.hotelId = :hotelId WHERE h.dbId= :dbId")
    void generateAndUpdateHotelId(@Param("dbId") Long dbId, @Param("hotelId") String hotelId);

    @Query("SELECT new com.foodie.dto.hotel.HotelDetails(h.hotelId, h.hotelName, h.hotelEmail, h.hotelType, h.phoneNumber, h.address, h.city, h.state, h.zipCode) " +
            "FROM HotelRegistrationRequest h WHERE h.dbId = :dbId")
    HotelDetails findByDbId(Long dbId);

    @Query("SELECT h FROM HotelRegistrationRequest h WHERE (h.hotelEmail = :loginId OR h.phoneNumber = :loginId) AND h.password = :password")
    HotelRegistrationRequest findByLoginIdAndPassword(@Param("loginId") String loginId, @Param("password") String password);

}
