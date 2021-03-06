
public class WhileTest {

	public static void main(String[] args) {
		
//		while 명령은 주어진 조건이 참인 동안 {} 블록을 반복한다.
//		반복으로 최초 진입시 조건이 거짓일 경우 {} 블록의 내용을 한 번도 실행하지 않는다.
//		while (조건식) {
//			조건식이 참인 동안 실행할 문장;
//			...;
//		}
		
		int i = 0, sum = 0;
		while (i < 100) {
			i++;
			sum += i;
		}
		System.out.println("1 ~ 100의 합계: " + sum);
		
//		do ~ while 명령은 주어진 조건이 참인 동안 {} 블록을 반복한다.
//		반복으로 최초 진입시 조건이 거짓일 경우 {} 블록의 내용을 한 번은 실행한다.
//		do {
//			조건식이 참인 동안 실행할 문장;
//			...;
//		} while (조건식);	";"를 빼먹으면 안된다.
		
//		0을 sum에 저장하고 sum에 저장된 값을 i에 저장한다. => 변수 선언시에는 사용할 수 없다.
		i = sum = 0;
		do {
			i++;
			sum += i;
		} while (i > 100);
		System.out.println("1 ~ 100의 합계: " + sum);
		
	}
}










