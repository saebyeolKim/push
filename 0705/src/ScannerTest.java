import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
//		자바 클래스 객체 생성 방법
//		클래스 이름 객체 이름 = new 생성자메소드(인수)
		Scanner scanner = new Scanner(System.in); // 키보드로부터 데이터를 입력받는 스캐너
	
//		변수: 프로그램에서 처리할 데이터(상수)를 기억하는 기억장소를 말한다.
//		변수 이름은 영문자, 숫자, 특수문자('_')만 사용해서 만들 수 있고 첫 문자는 반드시 문자로 시작해야하며 
//		예약어는 사용할 수 없다.
//		변수는 변수를 선언한 후 최초로 사용하기 전에 반드시 초기화시켜야 한다.
		
//		변수 선언 방법
//		자료형 변수이름:		변수를 선언만 한다. => 변수에는 쓰레기가 들어있다.
//		자료형 변수이름 = 초기치		변수를 선언하고 초기치로 초기화한다.

//		next(): 한 단어 입력, 띄어쓰기가 나오기 전까지 읽어들인다.
//		nextLine(): 한 줄 입력
//		nextLine()은 키보드 버퍼가 비어있으면 입력을 기다리며 대기하지만 키보드 버퍼가 비어있지 않을 경우 키보드
//		버퍼의 내용을 끝까지 읽어들인다. => 끝까지 읽어 들일 때 입력 완료할 때 입력한 enter키도 같이 읽어 들인다.
//		스캐너로  키보드를 통해서 입력하는 내용은 바로 변수에 저장되는 것이 아니고 키보드 버퍼라는 임시 기억장소에
//		저장되었다가 변수에 저장된다. => 키보드 버퍼에 저장되는 내용은 녹색으로 보인다.
		System.out.print("주소: ");
//		String addr = scanner.next();
		String addr = scanner.nextLine();
		System.out.print("이름: ");
		String name = scanner.nextLine();
		
		System.out.println(name + "님은 " + addr + "에 삽니다.");
	}

}

