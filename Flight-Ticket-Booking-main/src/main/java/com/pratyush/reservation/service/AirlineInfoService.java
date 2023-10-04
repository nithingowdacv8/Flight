package com.pratyush.reservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratyush.reservation.dao.AirlineInfoDao;
import com.pratyush.reservation.entity.AirlineInfo;

// public class AirlineInfoService {
    
// }
@Service
public class AirlineInfoService {
	
	@Autowired
	private AirlineInfoDao airlineInfoDao;
	

	public AirlineInfo findByNameOfAirline(String name) {
		return airlineInfoDao.findByNameOfAirline(name);
	}

}

