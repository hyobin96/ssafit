package com.ssafy.ssafit.model.dto;

public class User {
	private Long id;
	private String username;
	private String password;
	private String email;
	private String nickname;
	private boolean isAdmin;
	private boolean isDeleted;
	private String createdAt;
	private String updatedAt;

	public User() {
	}

	public User(Long id, String username, String password, String email, String nickname, boolean isAdmin,
			boolean isDeleted, String createdAt, String updatedAt) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.nickname = nickname;
		this.isAdmin = isAdmin;
		this.isDeleted = isDeleted;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", nickname=" + nickname + ", isAdmin=" + isAdmin + ", isDeleted=" + isDeleted + ", createdAt="
				+ createdAt + ", updatedAt=" + updatedAt + "]";
	}
	
	

}
