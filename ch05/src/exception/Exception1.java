package exception;

public class Exception1 {
	public static void main(String[] args) {
//		NullPointerException 발생 - 실행예외 (런타임 예외)
		String data = null;
		//toString() = data의 정보를 문자열로출력하는 매서드
//		data.toString();\
		
		//NumberFormatException - 숫자형식이 아닐때 발생예외
		String data2 ="a200";
		
		int value = Integer.parseInt(data2);
		System.out.println(value);
				
		
		
		
		
		
		
		
		
	}
}
