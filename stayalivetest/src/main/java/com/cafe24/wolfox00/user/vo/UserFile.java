package com.cafe24.wolfox00.user.vo;

public class UserFile {
	private int userFileNo;
	private String userId;
	private String userFilePath;
	private String userFileName;
	private String userFileExt;
	private String userFileType;
	private long userFileSize;
	private String userFileUploadDate;
	
	@Override
	public String toString() {
		return "UserFile [userFileNo=" + userFileNo + ", userId=" + userId + ", userFilePath=" + userFilePath
				+ ", userFileName=" + userFileName + ", userFileExt=" + userFileExt + ", userFileType=" + userFileType
				+ ", userFileSize=" + userFileSize + ", userFileUploadDate=" + userFileUploadDate + "]";
	}
	public int getUserFileNo() {
		return userFileNo;
	}
	public void setUserFileNo(int userFileNo) {
		this.userFileNo = userFileNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserFilePath() {
		return userFilePath;
	}
	public void setUserFilePath(String userFilePath) {
		this.userFilePath = userFilePath;
	}
	public String getUserFileName() {
		return userFileName;
	}
	public void setUserFileName(String userFileName) {
		this.userFileName = userFileName;
	}
	public String getUserFileExt() {
		return userFileExt;
	}
	public void setUserFileExt(String userFileExt) {
		this.userFileExt = userFileExt;
	}
	public String getUserFileType() {
		return userFileType;
	}
	public void setUserFileType(String userFileType) {
		this.userFileType = userFileType;
	}
	public long getUserFileSize() {
		return userFileSize;
	}
	public void setUserFileSize(long userFileSize) {
		this.userFileSize = userFileSize;
	}
	public String getUserFileUploadDate() {
		return userFileUploadDate;
	}
	public void setUserFileUploadDate(String userFileUploadDate) {
		this.userFileUploadDate = userFileUploadDate;
	}
	
}
