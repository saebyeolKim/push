package com.koreait.abstractClass;

import java.util.ArrayList;

//	다형성(Polymorphism)이란 하나의 메소드가 서로 다른 클래스에서 다양하게 실행되는 것을 말한다.
//	다형성을 구현하기 위해서는 다형성을 구현할 메소드가 포함된 모든 클래스가 같은 부모 클래스 또는 인터페이스를 가져야 한다.
//	부모 클래스 또는 인터페이스와 자식 클래스에 같은 이름의 메소드가 있어야 하고 자식 클래스는 이 메소드를 반드시 Override 시켜서
//	사용해야한다.
//	부모 클래스 타입의 객체에 자식 클래스 타입의 객체를 대입시켜 다형성이 구현된 메소드를 실행한다.
abstract class Animal {
//	public void move() {
//		System.out.println("동물이 움직입니다.");
//	}
	public abstract void move();
	
	public void eating() {
		
	}
		
}

class Human extends Animal {
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이는 네발로 걷습니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아 갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쫙~~ 펴고 멀리 날아갑니다.");
	}
}

public class InstanceOfTest {

	public static void main(String[] args) {

		Animal hanimal = new Human();
		Animal tanimal = new Tiger();
		Animal eanimal = new Eagle();
		
		InstanceOfTest test = new InstanceOfTest();
		test.moveAnimal(hanimal);
		test.moveAnimal(tanimal);
		test.moveAnimal(eanimal);
		System.out.println("==============================");
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hanimal);
		animalList.add(tanimal);
		animalList.add(eanimal);
		
		for (Animal animal : animalList) {
			animal.move();
		}
		System.out.println("==============================");
		
		test.downCastingTest(animalList);
		
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

	
	public void downCastingTest(ArrayList<Animal> animalList) {
		
		for (int i = 0; i < animalList.size(); i++) {
			Animal animal = animalList.get(i);
			
//			downcasting: upcasting된 클래스를 다시 원래의 타입으로 형변환시킨다.
//			instanceof 연잔자를 사용해서 형변환이 가능한지 확인한 후 downcasting을 실행한다.
			if (animal instanceof Human) {
				Human human = (Human) animal;
				human.readBooks();
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunting();
			} else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle) animal;
				eagle.flying();
			} else {
				System.out.println("downcasting 불가능");
			}
		}
	}
}





