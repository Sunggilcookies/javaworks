package statics;

public class CardTest {
	
	public static void main(String[] args) {
		//카드 번호 101, 102, 103번 생성
		
		Card cn1 = new Card();
		Card cn2 = new Card();
		Card cn3 = new Card();
		
		System.out.println(cn1.getCardNum());
		System.out.println(cn2.getCardNum());
		System.out.println(cn3.getCardNum());
		
	}
}
