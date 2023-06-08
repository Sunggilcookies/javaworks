package Strings;

public class StringSubstring {
	public static void main(String[] args) {
		
		//subst ring(인수1, 인수2) - 인수 1에서 시작해서 인수 2(값-1)까지 문자 추출
		String ssn = "940608-2345678";
		
		String firstPart = ssn.substring(0, 6);
		System.out.println(firstPart);
		
		//substring(인수1) -인수 1	끝부터 문자 끝까지 추출
		String secondPart = ssn.substring(6);
		System.out.println(secondPart);
		
		//url 경로 추출
		String uri = "/board/boardList.jsp";
		int uri_idx = uri.lastIndexOf('/');
		System.out.println(uri.substring(uri_idx));
		
		
	}
}
