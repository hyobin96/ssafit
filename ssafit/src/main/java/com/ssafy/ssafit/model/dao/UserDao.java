package com.ssafy.ssafit.model.dao;

import com.ssafy.ssafit.model.dto.User;

public interface UserDao {
	/**
	 * users테이블에 새로운 행 삽입
	 * @param user
	 * @return 바뀐 행의 개수 반환
	 */
	int insertUser(User user);
	
	int updateIsDeleted(int id);
	
	int deleteUserById(int id);
}
