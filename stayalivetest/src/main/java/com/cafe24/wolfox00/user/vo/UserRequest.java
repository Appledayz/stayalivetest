package com.cafe24.wolfox00.user.vo;

import org.springframework.web.multipart.MultipartFile;

public class UserRequest {
	private int userNo;
	private String userId;
	private String userPw;
	private MultipartFile userPhoto;
	private String userDate;
	
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public MultipartFile getUserPhoto() {
		return userPhoto;
	}
	public void setUserPhoto(MultipartFile userPhoto) {
		this.userPhoto = userPhoto;
	}
	public String getUserDate() {
		return userDate;
	}
	public void setUserDate(String userDate) {
		this.userDate = userDate;
	}
	
}
