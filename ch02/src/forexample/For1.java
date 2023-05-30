package forexample;

public class For1 {
	public static void main(String[] args) {
		//1부터 10까지 출력, 합계
		int sumV = 0; //합계 변수
		
		for(int i=1; i<10; i++) {
			sumV += i;
			System.out.println("i=" + i + ", sum=" + sumV);
		}
		System.out.println("합계 : " + sumV);
		//문자세트 - 알파벳 출력(대문자, 소문자)
		char ch;
		for(ch=67; ch<123; ch++) {
			System.out.println(ch + " ");	
		}
		System.out.println();
		// 유니코드 - 한글
	
		for(ch=12593; ch<12686; ch++) {
			System.out.println(ch + " ");	
		}
		
		//구구단
		
		int dan = 4;
		for(int i=1; i<10; i++) {
			
			System.out.println(dan + "x" + i + "=" + (dan*i));
		}
		System.out.println();
	}
}
