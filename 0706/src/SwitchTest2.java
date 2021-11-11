import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("마지막 날짜를 출력할 년, 월을 입력해주세요: ");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day;
		
		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day = 31;
				break;
			case 2:
				day = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;
				break;				
			case 4: case 6: case 9: case 11: 
				day = 30;
				break;
			default:
				day = 0;
				break;
		}
		if (day == 0) {
			System.out.println(month + "월은 존재하지 않는 달입니다.");
		} else {
			System.out.println(year + "년 " + month + "월의 마자막 날짜는 " + day + "일 입니다.");
		}
	
		
//		case를 구분할 때 간편하게 ","로 구분하고 break 대신 {} 블록으로 작업 영역을 구분한다.
//		switch의 실행 결과를 yield 명령으로 리턴받아 변수에 저장할 수 있다.
		day = switch (month) {
			case 1, 3, 5, 7, 8, 10, 12 -> {
				System.out.println("한 달은 31일입니다.");
				yield 31; // 리턴값
			}
			case 4, 6, 9, 11 -> {
				System.out.println("한 달은 30일 입니다.");
				yield 30;
			}
			case 2 -> {
				System.out.println("한 달은 28일 입니다.");
				yield 28;	
				}
			default -> {
				System.out.println("존재하지 않는 달입니다.");
				yield 0;	
			}
			
		};
		System.out.println( month + "월의 마지막 날짜는 " + day + "일 입니다.");
	}
}
	











