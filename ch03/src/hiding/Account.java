package hiding;

public class Account {
	//맴버변수, 생성자, 메서드
	private String ano;   //계좌 번호
	private String owner; //계좌주
	private int balance;  //잔고
	
	//외부에서 입력하겠다. Account 생성자
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	//get() 메서드 : get + 맴버변수이름()
	public String getAno() {
		return ano;
	}
	//set() 메서드 : set + 맴버변수이름()
	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public int getBalance() {
		return balance;
	}
	public void getBalance(int balance) {
		this.balance = balance;
	}
		
		
	
}
