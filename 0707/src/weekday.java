import java.util.Scanner;

public class weekday {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("요일을 계산할 년, 월, 일을 입력하세요: ");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		
//		1월 1일 부터 전년도 12월 31일까지 지나온 날짜를 계산한다.
		int total = 365 * (year - 1) + (year - 1) / 4 - (year - 1) / 100 + (year - 1) /400 ;  
//		전년도 12월 31일 까지의 합계의 전달까지 지난 날짜를 더한다.
//		for (int i = 1; i < month; i++) {
//			switch(i) {
//			case 2:
//				total += year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;
//				break;
//			case 4: case 6: case 9: case 11: 
//				total += 30;
//				break;
//			default:
//				total += 31;
//				break;
//				
//			}
//		} 	
		int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i = 1; i < month; i++) {
			m[1] = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;
			total += m[i - 1];
		}
		
//		전달까지 날짜의 합계에 일을 더한다.
		total += day;
//		System.out.println(total % 7);
		
//		날짜의 합계를 7로 나눈 나머지가 0이면 일, 1이면 월, 2이면 화, 3이면 수, 4이면 목, 5이면 금, 6이면 토
		switch (total % 7) {
			case 0: System.out.println("일요일"); break;
			case 1: System.out.println("월요일"); break;
			case 2: System.out.println("화요일"); break;
			case 3: System.out.println("수요일"); break;
			case 4: System.out.println("목요일"); break;
			case 5: System.out.println("금요일"); break;
			case 6: System.out.println("토요일"); break;
		}
		String[] week = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "초요일",};
		System.out.println(week[total % 7]);
		
		char[] weekChar = {'일', '월', '화', '수', '목', '금', '토'};
		System.out.println(weekChar[total % 7] + "요일");
		
	}

	
}










