package com.koreait.abstractClass;

public class TemplateMethodTest {

	public static void main(String[] args) {

		Car manualCar = new ManualCar();
		manualCar.run();
		System.out.println("============================================");
		
		Car aiCar = new AICar();
		aiCar.run();
	}

}
