import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("3과목 점수를 입력하세요: ");
		int java = scanner.nextInt();
		int jsp = scanner.nextInt();
		int spring = scanner.nextInt();
		
		int sum = java + jsp + spring;
		double mean = sum / 3.;
		System.out.println("평균점수: " + mean);
		
//		key에는 정수형 변수 또는 연산 결과가 정수인 수식만 사용할 수 있다. => JDK 1.7 부터는 문자열도 사용할 수 있다
//		switch (key) {
//			case value: 	// ":" 임에 주의하고 case에는 식을 사용할 수 없다.
//				key와 value가 같을 경우 실행할 문장;
//				...;
//				[break;]	// break는 필요에 따라서 생략할 수 있다.
//			...
//			[default: 		// 기타 등등 케이스
//				key와 일치하는 value가 없을 경우 실행할 문장;
//				...;
//				[break;]
//			 }
		switch ((int)mean / 10) {
			case 10:
				System.out.println("수");
				break;
			case 9:
				System.out.println("수");
				break;
			case 8:
				System.out.println("우");
				break;
			case 7:
				System.out.println("미");
				break;
			case 6:
				System.out.println("양");
				break;
//			같은 작업을 하는 case는 나열할 수 있다.	
//			case 5: case 4: case 3: case 2: case 1:
			default:
				System.out.println("가");
//				switch의 마지막 break는 생략해도 아무런 문제가 없다.
				break;
				
		}
		System.out.println("=================================");
		
		switch ((int)mean / 10) {
		case 10:
			System.out.println("참 잘했어요.");
		case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		case 6:
			System.out.println("양");
			break;
		default:
			System.out.println("가");
			break;
			
		}
		
	}

}
