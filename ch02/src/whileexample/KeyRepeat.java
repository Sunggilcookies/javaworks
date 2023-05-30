package whileexample;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		//'y'키 - "계속반복", 'n'키 - "반복중단" , 이외의 키 - "지원하지 않는 키 출력"
		// key == 'y'(비교 안됨), 문자열비교 equals() 메서드 사용
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("계속 반복할까요? ( y/n)");
			String key = sc.nextLine(); //String형이므로 쌍따움표를 사용.
//			if(key==y) 이건 인식불가 숫자만 통함
			if(key.equals("y")) {
				System.out.println("계쏙반복");
			}else if(key.equals("n")) {
				System.out.println("반복중단");
				break;
			}else {
				System.out.println("지원하지 앟ㄴ느 키입니다.");
			}
		
		}

	}

}
