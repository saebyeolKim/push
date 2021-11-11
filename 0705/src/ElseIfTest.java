import java.util.Scanner;

public class ElseIfTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("3과목 점수를 입력하세요: ");
		int java = scanner.nextInt();
		int jsp = scanner.nextInt();
		int spring = scanner.nextInt();
		
		int sum = java + jsp + spring;
		double mean = sum / 3.;
		System.out.println("평균점수: " + mean);
		
		if (mean >= 90) {
			System.out.println("수");
		}
		if (mean < 90 && mean >= 80) {
			System.out.println("우");
		}
		if (mean < 80 && mean >= 70) {
			System.out.println("미");
		}
		if (mean < 70 && mean >= 60) {
			System.out.println("양");
		}
		if (mean < 60) {
			System.out.println("가");
		}
//		파이선은 elif를 사용했지만 자바는 else if를 사용한다.
		if (mean >= 90) {
			System.out.println("수");
		} else if (mean < 90 && mean >= 80) {
			System.out.println("우");
		} else if (mean < 80 && mean >= 70) {
			System.out.println("미");
		} else if (mean < 70 && mean >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
		
		if (mean >= 90) {
			System.out.println("수");
		} else if (mean >= 80) {
			System.out.println("우");
		} else if (mean >= 70) {
			System.out.println("미");
		} else if (mean >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
	}
}
