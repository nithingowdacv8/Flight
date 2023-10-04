package com.pratyush.reservation.service;

import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.pratyush.reservation.dao.UserDao;

// import jakarta.transaction.Transactional;

@Service
public class AuthenticationService implements UserDetailsService{
	
	@Autowired
	private UserDao userDao;


	@Override
	@Transactional
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		com.pratyush.reservation.entity.User user = userDao.findByUserName(userName);
		Set<SimpleGrantedAuthority> grantedAuthorities = new HashSet<>();
		grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		return new org.springframework.security.core.userdetails.User(user.getUserName(), 
				    user.getPassword(), grantedAuthorities);
	}

}
