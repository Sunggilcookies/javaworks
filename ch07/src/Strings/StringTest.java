package Strings;



public class StringTest {
	public static void main(String[] args) {
		
		String javaStr = new String("java");
		String androidStr = new String("android");
		
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소값:"+System.identityHashCode(javaStr));
		
		
		System.out.println(androidStr);
		System.out.println("처음 문자열 주소값:"+System.identityHashCode(androidStr));
		
		//a문자열 연결 - concat()사용 메모리주소가 처음과 바뀜
		// 내부에 변경 불가능한 final har
		javaStr = javaStr.concat(androidStr);
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소값:"+System.identityHashCode(javaStr));
		
	}
}
