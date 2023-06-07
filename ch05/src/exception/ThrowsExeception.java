package exception;

public class ThrowsExeception {
	public static void main(String[] args) {
	
		try {
			findClass();
			System.out.println("클래스가 존재함");
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("클래슥 ㅏ존재하지 않습니ㅏㄷ.");
		}
		
		
	}
	
	
	
	public static void findClass() throws ClassNotFoundException {
		// throws - 예외처리 미루기 (사용하는 쪽에서 trY~  catch ㅎ마)
		Class.forName("java.util.ArrayList");
		
	}
}
