package com.ssafy.ssafit.model.service;

import org.springframework.stereotype.Service;

import com.ssafy.ssafit.model.dao.UserDao;
import com.ssafy.ssafit.model.dto.User;

@Service
public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean signUp(User user) {
		return userDao.insertUser(user) == 1;
	}

	@Override
	public boolean withdrawUser(int id) {
		return userDao.updateIsDeleted(id) == 1;
	}

	@Override
	public boolean deleteUserPermanently(int id) {
		return userDao.deleteUserById(id) == 1;
	}

	
	
}
