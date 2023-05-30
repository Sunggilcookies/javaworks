package singleton.card;

public class CardTest {
	
	public static void main(String[] args) {
		//CardComapny 객체 생성
		CardCompany cc = CardCompany.getInstance();
		
		
		Card cn1 = cc.createCard();
		Card cn2 = cc.createCard();
		Card cn3 = cc.createCard();
		
		System.out.println(cn1.getCardNum());
		System.out.println(cn2.getCardNum());
		System.out.println(cn3.getCardNum());
		
		
	
	}
}
