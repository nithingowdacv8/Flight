package com.pratyush.reservation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pratyush.reservation.entity.Passenger;

// public class PassengerDao {
    
// }

@Repository
public interface PassengerDao extends JpaRepository<Passenger, Long> {

}
