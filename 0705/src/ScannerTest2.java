import java.util.Scanner;

public class ScannerTest2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이: ");
		int age = scanner.nextInt();
//		next(), nextInt(), nextDouble() 등의 메소드는 자신이 읽어들일 데이터만 키보드 버퍼에서 읽어들인다.
//		=> 맨 마지막의 enter 키는 읽지 않고 키보드 버퍼에 그대로 남겨둔다. => 키보드 버퍼가 비어있지 않은 상태
		
//		이와 같은 문제를 해결하려면 nextLine() 메소드를 사용하기 전에 키보드 버퍼를 비워줘야 한다.
		scanner.nextLine(); // 키보드 버퍼를 비운다.
		
		System.out.print("이름: ");
		String name = scanner.nextLine();
		System.out.println(name + "님의 " + "나이는 " + age + " 입니다.");
		System.out.println(name + "님은 내년에" + (age + 1) + " 살 입니다.");
		
	}
}
