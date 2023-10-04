package com.pratyush.reservation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pratyush.reservation.entity.AirlineInfo;

// public class AirlineInfoDao {
    
// }

@Repository
public interface AirlineInfoDao extends JpaRepository<AirlineInfo, Long>{
	
	AirlineInfo findByNameOfAirline(String name);
}

