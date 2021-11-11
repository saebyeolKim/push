package com.koreait.InterfaceTest;


//	모든 유닛의 최고 조상 클래스 Unit 클래스를 만든다.
class Unit {
	
}
//	Unit 클래스를 상속받아 육상 유닛의 조상 클래스 GroundUnit 클래스를 만든다
class GroundUnit extends Unit {
	
}
//	Unit 클래스를 상속받아 공중 유닛의 조상 클래스 AirUnit 클래스를 만든다
class AirUnit extends Unit {
	
}
//	GroundUnit 클래스를 상속받아 육상 유닛 Tank, Marine, SCV 클래스를 만든다
class Tank extends GroundUnit {
	
}
class Marine extends GroundUnit {
	
}
class SCV extends GroundUnit {
	
}
//	AirUnit 클래스를 상속받아 공중 유닛 Dropship 클래스를 만든다
class Dropship extends AirUnit {

public class MarkerInterfaceTest {

	public static void main(String[] args) {
		
		
		
		}
	}
}
