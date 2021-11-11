
public class StringBuilderTest {

	public static void main(String[] args) {
		
		String java = new String("java");
		String android = new String("android");
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		
//		String을 연결하면 기존의 String에 연결되는 것이 아니고 새로운 문자열이 생성된다.
//		메모리 낭비가 발생될 수 있다.
		java = java + android;
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		
//		concat(): 문자열을 이어 붙인다.
		java = java.concat(android);
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		System.out.println("==============================");
		
		String jsp = new String("jsp");
		String spring = new String("spring");
		
		
//		StringBuilder 클래스는 내부적으로 가변적인 char[]를 멤버 변수로 가진다.
//		문자열을 연결할 때 String 클래스처험 문자열을 새로 만들지 않고 char[] 멤버 변수를 변경한다.
		StringBuilder builder = new StringBuilder(jsp);
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		builder.append(spring);
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		String str = "";
		for (int i = 0; i < 100000; i++) {
			str += "꽝";
		}
		System.out.println("strring을 사용해서 꽝 만번");

		StringBuilder str2 = new StringBuilder("");
		for (int i = 0; i < 100000; i++) {
			str2.append("꽝");
		}
		System.out.println("stringBuilder를 사용해서 꽝 만번");
		
//		StringBUffer는 멀티 쓰레드 프로그램에서 동기화를 보장하므로 멀티쓰레드 프로그램은 StringBUffer를 사용하고
//		단일 쓰레드 프로그램은 StringBuilder 사용을 권장한다.
	
//		text block 
//		문자열을 """와 """사이에 입력해서 줄바꿈이 되는 여러줄 문자열을 만들 수 있다.
		String strBlock = """
				개울가에
				올챙이 한마리
				꼬물꼬물 헤엄치다
				""";
		System.out.println(strBlock);
		 
	
	}
}















