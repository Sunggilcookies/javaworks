package Strings;

public class StringBuilderTest {
	public static void main(String[] args) {
		String javaStr = new String("java");
		System.out.println("처음 문자열 주소값:"+System.identityHashCode(javaStr));
		
		//buffer의 메모리 주소값은 문자 연결 후 변고ㅕㅇ되지않음
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 주소값:" +System.identityHashCode(buffer));
		
		//문자열 연결
		buffer.append(" and ");
		buffer.append(" android ");
		
		System.out.println("연산 후 주소값:" +System.identityHashCode(buffer));
		
		System.out.println(buffer);
		System.out.println(buffer.toString());
	}
}
