import java.util.Random;
import java.util.Scanner;


public class RandomTest {

	
	public static void main(String[] args) {
		
//		Math.random(): 0 이상이고 1 미만인 무작위수를 발생시킨다.
		System.out.println((int)(Math.random() * 6) + 1);
		
//		Random 클래스의 객체를 사용한다.
		Random random = new Random();
		System.out.println(random.nextDouble());
		System.out.println(random.nextInt());
		System.out.println(random.nextInt(6) + 1);
		

		}
				
	}

