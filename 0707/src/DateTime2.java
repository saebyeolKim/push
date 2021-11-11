import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateTime2 {

	public static void main(String[] args) {
		
		Date date = new Date();

//		Date 클래스 객체에서 년, 월, 일, 시, 분, 초를 얻어오려면 get으로 시작하는 메소드를 사용하고 수정하려면
//		set으로 시작하는 메소드를 사용한다.
//	    Date 클래스는 1900년을 기준으로 날짜를 처리하기 때문에 년을 얻어올 때는 1900을 더해서 얻어와야하고
//		월을 얻어올 때는 1을 더해서 얻어와야 한다. 반대로 저장할 때는 년을 1900을 빼고 월은 1을 빼서 저장한다.
		
		System.out.println("년: " + (date.getYear() + 1900));
		System.out.println("월: " + (date.getMonth() + 1));
		System.out.println("일: " + (date.getDate()));
		System.out.println("요일: " + (date.getDay()));   // 일요일 => 0, 월요일 => 1, ... , 토요일 => 6
		System.out.println("시: " + (date.getHours()));
		System.out.println("분: " + (date.getMinutes()));
		System.out.println("초: " + (date.getSeconds()));
		System.out.println("초: " + (date.getTimezoneOffset()));
		System.out.println("=================================");
		
		date.setYear(2021);
		System.out.println("년: " + (date.getYear() ));
		date.setMonth(7);
		System.out.println("월: " + date.getMonth());
		System.out.println("=================================");
		
		
		Calendar calendar = Calendar.getInstance();
		System.out.println("년: " + calendar.get(Calendar.YEAR));
		System.out.println("월: " + (calendar.get(Calendar.MONTH) + 1));
		System.out.println("일: " + calendar.get(Calendar.DATE));
		System.out.println("일: " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일: " + calendar.get(Calendar.DAY_OF_WEEK)); 	// 일요일 => 1, 월요일 => 2, ... , 토요일 => 7
		System.out.println("시간: " + calendar.get(Calendar.HOUR));			// 12시각
		System.out.println("시간: " + calendar.get(Calendar.HOUR_OF_DAY));	// 24시각
		System.out.println("분: " + calendar.get(Calendar.MINUTE));
		System.out.println("초: " + calendar.get(Calendar.SECOND));
		System.out.println("밀리초: " + calendar.get(Calendar.MILLISECOND));
		
		
		
	}

}
