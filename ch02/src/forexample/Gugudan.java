package forexample;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// 전체 구구단 추력
//		Scanner sc = new Scanner(System.in);
//		int dan = sc.nextInt();
		
		System.out.println("단을입력해주세요");
		for(int i=1;i<10;i++) {
			for(int j=1;j<=i;j++) {
			
				
				System.out.print(i +"x" + j + "=" + (j*i) + " " );
			}
			System.out.println();
		}
			
	}

}
