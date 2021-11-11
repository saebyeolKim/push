package com.koreait.scoreList;

public class ScoreListMain {

	public static void main(String[] args) {
		/*
		ScoreVO score1 = new ScoreVO();
		System.out.println(score1);
		ScoreVO score2 = new ScoreVO();
		System.out.println(score2);
		ScoreVO score3 = new ScoreVO();
		System.out.println(score3);
		
		System.out.println("ScoreVO.count: " + ScoreVO.count);
		System.out.println("score2.count: " + score2.count);
		score2.count = 100;
		System.out.println("score2.count: " + score2.count);
		System.out.println("score1.count: " + score1.count);
		System.out.println("score3.count: " + score3.count);
		
		ScoreVO score4 = new ScoreVO("홍길동", 100, 100, 99);
		System.out.println(score4);
		ScoreVO score5 = new ScoreVO("임꺽정", 45, 71, 59);
		System.out.println(score5);
		*/
		
		ScoreList scoreList = new ScoreList();
		
		ScoreVO score1 = new ScoreVO("홍길동", 100, 100, 99);
		ScoreVO score2 = new ScoreVO("임꺽정", 45, 71, 59);
		ScoreVO score3 = new ScoreVO("장길산", 88, 85, 91);
		ScoreVO score4 = new ScoreVO("장길산", 88, 85, 91);
		ScoreVO score5 = new ScoreVO("홍길동", 95, 83, 84);
		
		scoreList.addscore(score1);
		scoreList.addscore(score2);
		scoreList.addscore(score3);
		scoreList.addscore(score4);
		scoreList.addscore(score5);
		
		System.out.println(scoreList);
		
		
	}

}
