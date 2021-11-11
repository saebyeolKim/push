import java.util.Scanner;

public class ifTest {
	public static void main(String[] args) {
//		관계 연산자: 연산 결과는 무조건 참(true) 또는 거짓(false)이다.
//		>(크다, 초과), >=(크거나 같다, 이상), <(작다, 미만), <=(작거나 같다, 이하), ==(같다), !=(같지 않다)
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이: ");
		int age = scanner.nextInt();
		
//		if (조건식) {
//			조건식이 참일 경우 실행할 문장;
//			...;
//		} else {
//			조건식이 거짓일 경우 실행할 문장;
//			...;
//		}
//		조건을 만족하지 않을 경우 실행할 문장이 없다면 else 이하를 생략할 수 있다.
		
		if (age >= 19) {
			System.out.println("성인입니다. 어서오세요");
		} else {
			System.out.println("청소년은 집에 돌아가세요.");	
		}
		
//		삼항 연산자 => ?: => if 명령의 조건을 만족하거나 만족하지 않을 때 실행할 문장이 1문장씩일 경우 사용하면 편리
//		조건식 ? 조건식이 참일 경우 실행할 문장 : 조건식이 거짓일 경우 실행할 문장
		System.out.println(age >= 19 ? "성인입니다. 어서오세요" : "청소년은 집에 돌아가세요.");
		
//		논리 연산자 : 연산 결과는 무조건 참(true) 또는 거짓(false)이다.
//		&&: and, 논리곱, 두 조건이 모두 참일 경우에만 참, ~이고, ~이면서, ~중에서
//		||: or, 논리합, 두 조건중에서 한개이상 참일 경우 참, ~또는, ~이거나
//		! : not, 논리부정
		
		System.out.print("윤년, 평년을 판단할 년도를 입력해주세요: ");
		int year = scanner.nextInt();
//		년도가 4로 나눠 떨어지고 100으로 나눠 떨어지지 않거나 400으로 나눠서 떨어지면 윤년, 그렇치않으면 평년
		boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
				
		if (isLeapYear) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 평년입니다.");
		} 
//		산술연산자 => 관계연산자 => 논리연산자 => 삼항연산자 => 대입연산자
		System.out.println(year + "년은 " + (isLeapYear ? "윤" : "평") + "년입니다.");
		
		
	}
}













