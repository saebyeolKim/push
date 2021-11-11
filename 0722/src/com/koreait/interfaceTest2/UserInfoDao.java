package com.koreait.interfaceTest2;

public interface UserInfoDao {

	void insertUserInfo(UserInfo userInfo);		// 사용자 정보 저장 메소드
	void updateUserInfo(UserInfo userInfo);		// 사용자 정보 수정 메소드
	void deleteUserInfo(UserInfo userInfo);		// 사용자 정보 삭제 메소드
}
