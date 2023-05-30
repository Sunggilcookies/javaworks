package transport;

//사람 클래스(참조 자료형)
public class Person {
	
	String name;
	int age;
	int money; //가진돈
	
	
	Person(String name, int money){
		this.name = name;
		this.money = money;
		
	}
	
	
	//요금을 내고 교통수단을 이용하는 메서드
	//VEhicle vehicle ->상속과 다형성 이용
	public void take(Vehicle vehicle, int fee) {
		vehicle.carry(fee);
		this.money -= fee; //가진돈에서 요금만큼 차단
	}
	//사람의 정보 
	void showInfo() {
		System.out.printf("%s님의 남은 요금은 %d입니다.", name,money);
	}
	
	//void takeBus();
	//void showInfo();
	
}
