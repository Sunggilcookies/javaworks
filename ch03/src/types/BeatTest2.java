package types;

public class BeatTest2 {
	public static void main(String[] args) {
		//비트 논리 연산자
		int num1 = 5; //0000101
		int num2 = 10; // 00001010
		int result1, result2;
		
		//비트 연산
		result1 = num1&num2; // 비트 논리단 둘다 1일떄 1 
			result2 = num1|num2; ///비트 논리합 둘중 하나만 1어이도 1임
		System.out.println(result1);
		System.out.println(result2);
		
		//비트 이동(shift) 연산자
		// << - d왼쪽 시프트, >> - 오른쪽 시프트
		// 00000101 <<2 -----> 00010100  (20)
		// 00000101 <<2 -----> 00000001   (1)
		
		int val =2;
		System.out.println(val << 1); //00000100 - 4
		System.out.println(val << 2); //00001000 - 8
		System.out.println(val >> 1); //00000001 - 1
		System.out.println(val >> 2); //00000000 - 0
		
	}
}
