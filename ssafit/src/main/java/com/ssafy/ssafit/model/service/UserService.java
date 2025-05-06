package com.ssafy.ssafit.model.service;

import com.ssafy.ssafit.model.dto.User;

public interface UserService {
	/**
	 * 회원등록
	 * @param user
	 * @return 등록이 되었는지
	 */
	boolean signUp(User user);
	
	boolean withdrawUser(int id);
	
	boolean deleteUserPermanently(int id);
}
