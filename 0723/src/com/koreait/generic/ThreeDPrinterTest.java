package com.koreait.generic;

public class ThreeDPrinterTest {

	public static void main(String[] args) {

		ThreeDPrinter1 printer1 = new ThreeDPrinter1();
		Powder powder = new Powder();
		printer1.setMaterial(powder);
		System.out.println(printer1.getMaterial());
		powder = printer1.getMaterial();
		
		ThreeDPrinter2 printer2 = new ThreeDPrinter2();
		Plastic plastic = new Plastic();
		printer2.setMaterial(plastic);
		System.out.println(printer2.getMaterial());
		plastic = printer2.getMaterial();
		
		ThreeDPrinter printer = new ThreeDPrinter();
		printer.setMaterial(powder);
		System.out.println(printer.getMaterial());
//		Object 클래스 객체를 사용한 경우 반드시 형변환을 시켜야 한다.
		powder = (Powder) printer.getMaterial();
		
		printer.setMaterial(plastic);
		System.out.println(printer.getMaterial());
		plastic = (Plastic) printer.getMaterial();
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(powder);
		System.out.println(powderPrinter.getMaterial());
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(plastic);
		System.out.println(plasticPrinter.getMaterial());
		
		GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
		waterPrinter.setMaterial(new Water());
		System.out.println(waterPrinter.getMaterial());
		
	}
}
