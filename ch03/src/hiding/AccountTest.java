package hiding;

public class AccountTest {
	public static void main(String[] args) {
		//계좌 객체 생성
		Account a1 = new Account("1000-1234","이몽룡",50000);
		Account a2 = new Account("1000-2345","성춘향",100000);

		a1.setAno("2000-1234");
		
		//a1의 메서드에 메모메모
		System.out.println("계좌번호 :" + a1.getAno());
		System.out.println("계좌주 :" + a1.getOwner());
		System.out.println("잔액 :" + a1.getBalance());
		
		System.out.println("계좌번호 :" + a2.getAno());
		System.out.println("계좌주 :" + a2.getOwner());
		System.out.println("잔액 :" + a2.getBalance());
	}
}
