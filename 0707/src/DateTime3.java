import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTime3 {

	public static void main(String[] args) {
//  년월일 입력받아 날짜데이터만들기
		
		Scanner scanner = new Scanner(System.in);
//		System.out.print("년, 월, 일: ");
//		int year = scanner.nextInt() - 1900;
//		int month = scanner.nextInt() - 1;
//		int day = scanner.nextInt();
//		
//		Date date = new Date(year, month, day);
//		System.out.println(date);
//		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd(E)");
//		System.out.println(sdf2.format(date));
		
//		주민등록번호 입력받은 후 생일을 날짜로 만들기 
		System.out.println("주민등록번호를 '-'없이 입력해주세요: ");
		String juminNo = scanner.nextLine().trim();
		
//		int year = (juminNo.substring(0, 2).charAt(0) - 48) * 10 + (juminNo.substring(0, 2).charAt(1)) - '0';
		int year = Integer.parseInt(juminNo.substring(0, 2));
//		System.out.println(year);
//		int month = (juminNo.substring(2, 4).charAt(0) - 48) * 10 + (juminNo.substring(2, 4).charAt(1)) - '0';
		int month = Integer.parseInt(juminNo.substring(2, 4));
//		System.out.println(month);
//		int day = (juminNo.substring(4, 6).charAt(0) - 48) * 10 + (juminNo.substring(4, 6).charAt(1)) - '0';
		int day = Integer.parseInt(juminNo.substring(4, 6));
		
		if (juminNo.charAt(6) > '2') {
			year += 100;
		}
		Date date = new Date(year, month - 1, day);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd(E)");
		System.out.println(sdf2.format(date));
	}

}
