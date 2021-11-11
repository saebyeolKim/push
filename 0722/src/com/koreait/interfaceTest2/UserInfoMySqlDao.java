package com.koreait.interfaceTest2;

public class UserInfoMySqlDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert into MYSQL DB userId = " + userInfo.getUserID());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update into MYSQL DB userId = " + userInfo.getUserID());

	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete into MYSQL DB userId = " + userInfo.getUserID());

	}

}
