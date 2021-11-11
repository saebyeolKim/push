
public class ForTest {

	public static void main(String[] args) {
		
//		일반 for 명령은 {} 블록을 조건이 만족하는 동안 반복한다.
//		변수에 저장된 초기치로 조건식을 비교해서 참이면 반복을 시작하고 거짓이면 반복을 시작하지 않는다.
//		{} 블록을 한 번 실행한 후 증감치 만큼 변수 값을 변경하고 조건식을 비교해 참이면 반복하고 거짓이면 반복을 중지
		
//		for (자료형 변수이름 = 초기치; 조건식; 증감치) {
//			조건이 참인동안 실행할 문장;
//			...;
//		} 
		
		
//		python
//		total = 0
//		for i in range(1, 11):
//			totoal += i
		
		int total = 0;
		for (int i = 1; i <= 10; i++) {
			total += i;
		}
		System.out.println("1 ~ 10의 합계: " + total);
		
//		증감 연산자: ++(1증가), --(1감소)
//		a++: a에 저장된 값을 사용하고 ";"을 만나서 문장이 바뀔 때 1증가 시킨다. 사용 후 증가
//		++a: a에 저장된 값을 1증가 시킨 후 사용한다. 증가 후 사용
//		--a: a에 저장된 값을 사용하고 ";"을 만나서 문장이 바뀔 때 1감소 시킨다. 사용 후 감소
//		a--: a에 저장된 값을 1감소 시킨 후 사용한다. 감소 후 사용
		
		int a = 1, b, c;
		b = a++;
		c = ++a;
		System.out.println("a = " + a + " b = " + b + " c = " + c);
		
		
		int d= 1, e;
		e = ++d + ++d + ++d + ++d;
		System.out.println("d = " + d + " e = " + e);
	}
}










