package input;

import java.util.Scanner;
//try - catch 구문을 써주면 됩니다.
public class EvenOdd {
	public static void main(String[] args) {
		// 숫자를 입력받아 홀수짝수를 판별하는 프로그램을 작성하세요
	try{
		Scanner scan = new Scanner(System.in);
	
		System.out.println("숫자를 입력해주세요");
		int hi;
		hi = scan.nextInt();
				
		String ch =(hi % 2 == 0) ? "짝수" : "홀수";
		System.out.printf("%d는 %s입니다.",hi,ch);
		scan.close();
	}
	catch(Exception e) {
		System.out.println("숫자를 입력하지 않으셨습니다.");
	}
}
}
