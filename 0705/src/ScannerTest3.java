import java.util.Scanner;

public class ScannerTest3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		키보드로 1문자 입력받기
		System.out.println("continue (y/n)?");
//		charAt(): 문자열에서 인수로 지정된 인덱스에 해당되는 문자 1개를 얻어온다. => 인덱스는 0부터 시작한다.
		char confirm = scanner.nextLine().charAt(0);
		System.out.println(confirm);
		

	}

}
