package com.koreait.memoProjectWIN;

import java.util.Date;

//	VO(Value Object): 게시글 1건을 기억할 클래스, DTO(Data Transfer Object)
//	bean: 처리할 데이터를 기억할 멤버 변수와 멤버 변수에 데이터를 입출력하는 getters & setters 메소드로만 구성된 클래스
public class MemoVO {
	
//	멤버 변수 이름은 테이블에 정의한 필드의 이름, html의 form 태그 요소의 name 속성에서 정의한 이름과 반드시 같은 이름으로 만든다.
 	private int idx;			// 글번호 
	private String name;		// 작성자 이름
	private String password;	// 비밀번호
	private String memo;		// 게시글
	private Date writeDate;		// 작성일 

	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	@Override
	public String toString() {
		return "MemoVO [idx=" + idx + ", name=" + name + ", password=" + password + ", memo=" + memo + ", writeDate="
				+ writeDate + "]";
	}
	
	

	
	

}
