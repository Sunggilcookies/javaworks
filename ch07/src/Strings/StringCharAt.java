package Strings;

public class StringCharAt {
	public static void main(String[] args) {
		// 문자열 함수 - charAt(인덱스 :그위치의 문자 반환(리턴)
		String subject =" 자바프로그래밍";
		char charValue = subject.charAt(0);
		System.out.println(charValue);
		
		//주민번호에서 남여 구분
		String ssn = "940815-3234567";
		char gender =  ssn.charAt(7); //'-'
		switch(gender) {
		
		case '2','4':
			System.out.println("여자입니다.");
			break;
		case '1','3': 
			System.out.println("남자입니다.");
			break;
		
		
	}
}}
