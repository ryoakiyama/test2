package com.internousdev.dogweb.dto;

public class DogDTO {
	private int userId;
	private String userName;
	private String password;
	private String img;
	private String result;
	public int getUserId() {
	return userId;
	}
	public void setUserId(int userId) {
	this.userId = userId;
	}
	public String getUserName() {
	return userName;
	}
	public void setUserName(String userName) {
	this.userName = userName;
	}
	public String getPassword() {
	return password;
	}
	public void setPassword(String password) {
	this.password = password;
	}

	public String getResult() {
	return result;
	}
	public void setResult(String result) {
	this.result = result;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}

}
