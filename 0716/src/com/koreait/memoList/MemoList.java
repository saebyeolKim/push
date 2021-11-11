package com.koreait.memoList;

import java.util.ArrayList;

// 게시글 여러건을 기억하는 클래스
public class MemoList {
	
	ArrayList<MemoVO> memoList = new ArrayList<>();

	public ArrayList<MemoVO> getMemoList() {
		return memoList;
	}

	public void setMemoList(ArrayList<MemoVO> memoList) {
		this.memoList = memoList;
	}

	@Override
	public String toString() {
//		마지막에 입력한 글(최신글)부터 출력하기 위해서 ArrayList에 저장된 마지막 글부터 출력
		String str = "";
		if (memoList.size() == 0) {
			str += "저장된 글이 없습니다.\n";
		} 
//		for (int = 0; i <memoList.size(); i++) // 처음부터
		for (int i = memoList.size() - 1; i >= 0 ; i--) {	// 마지막부터
			str += memoList.get(i) + "\n";
		}
//		for (MemoVO vo : memoList) {
//			str += vo + "\n";
//		}
		return str;
	}

//	MemoProgectMain 클래스에서 호출되는 memoList라는 ArrayList에 저장할 데이터가 저장된 MemoVO 클래스의 객체를 넘겨받고
//	memoList라는 ArrayList에 저장하는 메소드
	public void addMemo(MemoVO vo) {
		memoList.add(vo);
		
	}


//	memoProjectMain 클래스에서 호출되는 수정 또는 삭제할 글번호를 넘겨받고 memoList라는 ArrayList에 저장된 글 중에서
//	글번호에 해당된 글 1건을 얻어와 리턴시키는 메소드
	public MemoVO selectMemo(int idx) {
		try {
			return memoList.get(idx - 1);			
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}

//	memoProjectMain 클래스에서 호출되는 수정할 글번호와 메모를 넘겨받고 memoList라는 ArrayList에 저장된 글 중에서 글번호에 
//	해당되는 글 1건을 수정하는 메소드
	public void updateMemo(int idx, String memo) {
		memoList.get(idx - 1).setMemo(memo);
		
	}

//	memoProjectMain 클래스에서 호출되는 삭제할 글번호와 메모를 넘겨받고 memoList라는 ArrayList에 저장된 글 중에서 글번호에 
//	해당되는 글 1건을 삭제하는 메소드
	public void deleteMemo(int idx) {
		memoList.remove(idx - 1);
		
//		글 삭제 후 글번호를 다시 붙여준다. => ArrayList를 사용하기 때문에 이런일이 발생한다.
		for (int i = 0; i < memoList.size(); i++) {
			memoList.get(i).setIdx(i + 1);
		}
		
//		글이 삭제된 후 새글이 입력될 때 idx가 기존 idx 값에 이어서 1씩 증가할 수 있도록 count의 값을 수정한다.
		MemoVO.count = memoList.size();
		
	}

}








