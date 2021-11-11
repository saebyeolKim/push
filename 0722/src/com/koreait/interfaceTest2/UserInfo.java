package com.koreait.interfaceTest2;

public class UserInfo {

	private String userID;
	private String passwd;
	private String userName;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return "UserInfo [userID=" + userID + ", passwd=" + passwd + ", userName=" + userName + "]";
	}
	
	
}
