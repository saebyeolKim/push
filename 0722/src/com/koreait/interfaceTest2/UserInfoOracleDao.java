package com.koreait.interfaceTest2;

public class UserInfoOracleDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert into ORACLE DB userId = " + userInfo.getUserID());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update into ORACLE DB userId = " + userInfo.getUserID());

	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete into ORACLE DB userId = " + userInfo.getUserID());

	}

}
