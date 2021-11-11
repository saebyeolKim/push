import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
//		추첨기를 만든다.
		int[] lotto = new int[45];
		
//		추천기에 공을 넣는다.
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
view(lotto);
		System.out.println("\n=========== 섞기전 ===========");
		
//		섞는다.	
//		lotto[0]와 lotto[1] ~ lotto[44]중에서 랜덤한 위치의 값을 선택해서 두 기억장소의 값을 교환한다.
		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			int r = random.nextInt(44) + 1;
			int temp = lotto[0];
			lotto[0] = lotto[r];
			lotto[r] = temp;
		}
//			섞은후 상태를 출력한다.
		view(lotto);
		System.out.println("\n=========== 섞은후 ===========");
		
//		lotto 배열의 0 ~ 5 번째 인덱스 값이 1등 번호 6번째 인덱스 값은 보너스 번호
		System.out.print("1등 번호: ");
		for (int i = 0; i < 6; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.printf("%02d", lotto[i]);
			
//			Thread 클래스의 sleep() 메소드를 이용해서 프로그램을 일정 시간동안 멈춘다.
			try {
				Thread.sleep(1000); // 시간은 밀리(1/1000초)초 단위로 지정한다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
			
		}
			System.out.printf(" 보너스: %02d\n", lotto[6]);
					
	}

	private static void view(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("%2d ", lotto[i]);
			if ((i + 1) % 10 == 0) {
				System.out.println();				
			}
		}
	}

}
