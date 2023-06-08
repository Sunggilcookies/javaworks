package Strings;

public class StringindexOf {

	public static void main(String[] args) {
		//indexOf() 메서드 사용
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(location != -1) { //찾는 위치가 없지 않다면
			System.out.println("자바와 관련이 있는 책이군요!");
		}else {
			System.out.println("자바와 관련이 없는 책이군요!");
		}
		
		//lastIndexOf() 메서드 사용
		String uri = "/board/boardList.jsp";
		int uri_idx1 = uri.indexOf("/");
		System.out.println(uri_idx1);
		
		
		int uri_idx2 = uri.lastIndexOf('/'); //뒤에서 부터 찾지만 인덱스 셀때는 앞에서 샘
		System.out.println(uri_idx2);
	}
}