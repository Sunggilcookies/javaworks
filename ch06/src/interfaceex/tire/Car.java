package interfaceex.tire;

public class Car {
	//금타이어와 한타이어는 참조관계 그렇지만 부모형 Tire을 가져옴
	//필드 (객체 생성) - 부모형으로 생성
	Tire frontLeftTire = new HanTire();
	Tire frontRightTire = new HanTire();
	Tire backRightTire = new KumTire();
	Tire backLeftTire = new KumTire();
	
	//메서드
	public void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
	
	
	
	
}
