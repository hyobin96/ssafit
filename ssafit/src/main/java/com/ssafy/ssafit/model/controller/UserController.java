package com.ssafy.ssafit.model.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.ssafit.model.dto.User;
import com.ssafy.ssafit.model.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	/**
	 * 회원가입
	 * 
	 * @param user
	 * @return 성공 시 200, 실패 시 500
	 */
	@PostMapping("")
	public ResponseEntity<?> regist(@RequestBody User user) {
		if(userService.signUp(user)) {
			Map<String, String> info = new HashMap<>();
			info.put("id", user.getId() + "");
			info.put("username", user.getUsername());
			
			return ResponseEntity.ok(info);
		}
		
		return ResponseEntity.internalServerError().body("처리 중 오류가 발생했습니다.");
	}

	/**
	 * 회원탈퇴, 소프트 삭제
	 * 
	 * @param userId
	 * @return 성공 시 200, 실패 시 500
	 */
	@PutMapping("{userId}")
	public ResponseEntity<?> withdrawUser(@PathVariable("userId") int id) {
		return userService.withdrawUser(id) ? ResponseEntity.ok().build()
				: ResponseEntity.internalServerError().body("처리 중 오류가 발생했습니다.");
	}

	/**
	 * 회원탈퇴, 영구 삭제
	 * 
	 * @param id
	 * @return 성공 시 200, 실패 시 500
	 */
	@DeleteMapping("{userId}")
	public ResponseEntity<?> deleteUserPermanently(@PathVariable("userId") int id) {
		return userService.deleteUserPermanently(id) ? ResponseEntity.ok().build()
				: ResponseEntity.internalServerError().body("처리 중 오류가 발생했습니다.");
	}

	/**
	 * 로그인
	 */
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody User user) {

		return null;
	}

}
