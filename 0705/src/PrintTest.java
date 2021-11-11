
public class PrintTest {

	public static void main(String[] args) {
		
//		자바는 "+" 연산자가 2가지 용도로 사용된다.
// 		"+" 양쪽 모두 숫자일 경우 덧셈이 실행되고 "+"의 한쪽이라도 문자열이 나오면 문자열 연결 연산자로 사용된다.
		System.out.println(5 + " + " + 3 + " = " + (5 + 3));
		System.out.println(5 + " - " + 3 + " = " + (5 - 3));
		System.out.println(5 + " * " + 3 + " = " + 5 * 3);
//		자바는 정수와 정수의 연산은 결과도 정수다.
		System.out.println(5 + " / " + 3 + " = " + 5 / 3);
		System.out.println(5 + " % " + 3 + " = " + 5 % 3);
		System.out.println("=====================================");

//		자바의 기본 자료형
//	*	boolean	: 1바이트, 논리값(true => 참, false => 거짓)을 기억한다.
//		byte	: 1바이트, 파일 전송 = 파일 다운로드
//	*	char	: 2바이트, 문자 1개 => 자바는 Unicode를 사용한다.
//		short	: 2바이트, -32768 ~ 32767 사이의 정수를 저장할 수 있다.
// 	*	int		: 4바이트, -2147483648 ~ 2147483647 사이의 정수를 저장할 수 있다.
// 		long	: 8바이트, -2의 63승 ~ 2의 63승 -1 사이의 정수를 저장할 수 있다.
// 		float	: 4바이트, 단정도 실수, 소수점 아래로 6자리 정도를 표현한다. 
// 	*	double	: 8바이트, 배정도 실수, 소수점 아래로 16자리 정도를 표현한다.

//		묵시적 형변환
// 		자료형의 크기가 서로 다른 자료의 연산 결과는 크기가 큰 자료형으로 자동 변환된다.
		System.out.println(5 + " / " + 3 + " = " + 5 / 3);
		System.out.println(5 + " / " + 3 + " = " + 5 / 3.);
		System.out.println('A' + " + " + 32 + " = " + ('A' + 32));
		System.out.println('a' + " - " + 32 + " = " + ('a' - 32));
		System.out.println("=====================================");
		
//		명시적 형변환 => casting
//		프로그래머가 그 순간의 자료형을 지정할 수 있다.
		System.out.println(5 + " / " + 3 + " = " + (double) 5 / 3);
		System.out.println('A' + " + " + 32 + " = " + (char)('A' + 32));
		System.out.println('a' + " - " + 32 + " = " + (char)('a' - 32));
		System.out.println("=====================================");
		
//		서식있는 출력
//		printf("출력 서식", 출력할 내용)
//		출력 서식은 출력 서식 문자를 제외한 나머지 문자는 입력한 그대로 출력된다.
//		출력 서식 문자: d(정수), f(실수), s(문자열), c(문자)
//		출력 서식의 형식: %[-][0][n][.m]서식문자 => []안의 내용은 필요하면 적는다.
//		n : 출력할 전체 자리수
//		- : 전체 자리수가 지정된 경우 왼쪽으로 맞춰서 출력한다.
//		0 : 전체 자리수가 지정된 경우 왼쪽의 남는 자리를 "0"을 채워서 출력한다.
//		.m: 소수점 아래 출력할 자리수, 잘리는 자리에서 반올림시켜 화면에 표시한다.

		System.out.printf("%d + %d = %d\n", 5, 3, 5 + 3);
		System.out.printf("%d - %d = %d\n", 5, 3, 5 - 3);
		System.out.printf("%d * %d = %d\n", 5, 3, 5 * 3);
		System.out.printf("%d / %d = %f\n", 5, 3, 5 / 3.);
		System.out.printf("%d / %d = %f\n", 5, 3, (double)5 / 3);
//		printf() 메소드의 출력 서식을 이용해서 "%" 자체를 출력하려면 "%%"와 같이 2개를 써야 정상 출력된다.
		System.out.printf("%d %% %d = %d\n", 5, 3, 5 % 3);
		System.out.println("=====================================");
		
		System.out.printf("%d\n", 100);
		System.out.printf("%d\n", 1);
		System.out.printf("%d\n", 10000);
		System.out.println("=====================================");
		
		System.out.printf("%5d\n", 100);
		System.out.printf("%5d\n", 1);
		System.out.printf("%-5d\n", 1);
		System.out.printf("%05d\n", 1);
		System.out.printf("%5d\n", 10000);
		System.out.println("=====================================");
		
		System.out.printf("%s\n", "abc");
		System.out.printf("%s\n", "a");
		System.out.printf("%s\n", "abcde");
		System.out.println("=====================================");
		
		System.out.printf("%5s\n", "abc");
		System.out.printf("%5s\n", "a");
		System.out.printf("%-5s\n", "a");
//		System.out.printf("%05s\n", "a"); // 문자열 서식에 "0"을 사용하면 에러가 발생된다.
		System.out.printf("%5s\n", "abcde");
		System.out.println("=====================================");
		
		System.out.printf("%6.2f\n", 123.45);
		System.out.printf("%6.2f\n", 123.456);
		System.out.printf("%6.2f\n", 123.4);
	}

}



















