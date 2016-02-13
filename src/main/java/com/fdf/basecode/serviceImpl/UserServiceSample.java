package com.fdf.basecode.serviceImpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdf.basecode.dao.UserDAO;
import com.fdf.basecode.entity.UserCred;

@Service
@Transactional
public class UserServiceSample {
	
	@Autowired
	private UserDAO userdao;
	
	public UserCred getUser(String login) {
		return userdao.getUser(login);
	}
}
