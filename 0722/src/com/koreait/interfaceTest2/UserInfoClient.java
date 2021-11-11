package com.koreait.interfaceTest2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {

	public static void main(String[] args) {
		String dbType = "";
//		FileInputStream 클래스는 파일에서 바이트 단위로 데이터를 읽어온다.
		FileInputStream	fis = null;
		try {
//			FileInputStream 클래스 생성자의 인수로 파일 이름만 넣어주면 프로젝트 이름의 폴더에 있는 파일을 읽는다.
			fis = new FileInputStream("./src/com/koreait/interfaceTest2/db.properties");
			
//			read(): FileInputStream 클래스 객체에서 1바이트의 데이터를 읽어온다. 
//			코드값으로 읽어오기 때문에 문자로 출력하려면 형변환이 필요하다.\
//			읽어들인 데이터가 있으면 읽어들인 데이터를 코드값으로 리턴하고 읽어들인 데이터가 없으면 -1을 리턴한다.
//			System.out.println((char)fis.read());
//			int i;
//			while ((i = fis.read()) != -1) {	// 파일에서 읽어들인 데이터가 있는 동안 반복한다.
//				System.out.print((char) i);
//			}
//			System.out.println();
			
//		Properties 클래스는 FileInputStream 객체로 읽어들인 properties 파일의 데이터를 읽어온다.
			Properties properties = new Properties();
//		load(): FileInputStream 객체로 읽어들인 properties 파일을 읽어들인다.
			properties.load(fis);
//			getProperty(): 인수로 properties 파일의 key를 넘겨 key("=" 왼쪽 부분)에 해당되는 value("=" 오른쪽 부분)를 얻어온다.
			dbType = properties.getProperty("DBTYPE");
//			System.out.println("DBTYPE: " + dbType);
					
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
			try { fis.close();} catch (IOException e) {e.printStackTrace();}				
			}
		}	// try
		
		UserInfo userinfo = new UserInfo();
		userinfo.setUserID("qwer");
		userinfo.setPasswd("12345");
		userinfo.setUserName("홍길동");
//		System.out.println(userinfo);
		
		UserInfoDao userInfoDao = null;
		if (dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		} else if (dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		} else {
			System.out.println(dbType + "은(는) 지원되지 않는 데이터베이스입니다.");
			return;
		}
		
		userInfoDao.insertUserInfo(userinfo);
		userInfoDao.updateUserInfo(userinfo);
		userInfoDao.deleteUserInfo(userinfo);
	}

}



