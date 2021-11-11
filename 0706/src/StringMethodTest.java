import java.util.Scanner;

public class StringMethodTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String str = scanner.nextLine();
//		입력 단계에서 불필요한 공백을 제거하고 입력받으려면 아래와 같이 trim() 메소드를 사용하면 된다.
//		String str = scanner.nextLine().trim();
//		키보드로 한 문자만 입력받으려면 아래와 같이 charAt() 메소드를 사용해서 입력받으면 된다.
//		char ch = scanner.nextLine().charAt(0);
		
		
//		length(): 문자열을 구성하는 문자의 개수를 센다.
		System.out.println("입력한 문자수: " + str.length());
		
//		trim(): 문자열 앞, 뒤의 불필요한 빈 칸을 제거한다.
		System.out.println("불필요한 빈 칸을 제외한 입력한 문자수: " + str.trim().length());
		
//		toUpperCase() 메소드는 영문자를 무조건 대문자로 변환하고 toLowerCase() 영문자를 무조건 소문자로 변환한다.
		System.out.println("무조건 대문자로: " + str.toUpperCase());
		System.out.println("무조건 소문자로: " + str.toLowerCase());
		
//		charAt(index): 문자열에서 지정된 index 번째 위치의 문자를 얻어온다. => index는 0부터 시작한다.
		System.out.println("6번째 문자: " + str.charAt(5));
		
//		substring(a)	=> 문자열의 a번째 인덱스의 문자부터 마지막 인덱스의 문자까지 얻어온다.
//		substring(a,b)	=> 문자열의 a번째 인덱스의 문자부터 b-1번째 인덱스의 문자까지 얻어온다.
		System.out.println(str.substring(2));
		System.out.println(str.substring(2, 6));
		
//		indexOf()		=> 문자열의 왼쪽부터 검색해서 인수로 지정된 문자열이 최초로 나타나는 위치의 인덱스를 얻어온다.
//		lastIndexOf()	=> 문자열의 오른쪽부터 검색해서 인수로 지정된 문자열이 최초로 나타나는 위치의 인덱스를 얻어온다.
		System.out.println(str.indexOf("IT"));
		System.out.println(str.lastIndexOf("IT"));
//		indexOf(), lastIndexOf() 메소드는 인수로 지정된 문자열이 포함되어있지 않으면 -1을 리턴한다.
		System.out.println(str.indexOf("it"));
		System.out.println(str.lastIndexOf("it"));
		
//		contains(): 문자열에 인수로 지정된 문자열이 포함되어있으면 true, 없으면 false를 리턴한다. 
		System.out.println(str.contains("IT"));
		System.out.println(str.contains("it"));
		
//		matches(): 문자열이 인수로 지정된 문자열과 완전히 일치하면 true, 완전히 일치하지 않으면 false를 리턴한다.
		System.out.println(str.matches("ITkoreaIT"));
		System.out.println(str.matches("itkoreait"));
		
		
		
		
	}
}






