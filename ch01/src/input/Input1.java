package input;

import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) {
		//입력 처리 - Scanner
		Scanner scan = new Scanner(System.in);
		
		System.out.println("당신의 이름은 무엇입니까?");
		String name = scan.nextLine(); //콘솔창에 이름 입력
		System.out.printf("당신의 이름은 %s이군요",name);
						
		System.out.println("당신의 나이는 몇 세입니까?");
		int age = scan.nextInt();
		System.out.printf("당신의 나이는 %d이군요",age);
		
		scan.close(); //닫기
		
	}

}
