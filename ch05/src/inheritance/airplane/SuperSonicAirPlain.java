package inheritance.airplane;

public class SuperSonicAirPlain extends AirPlane{
	//상수 설정
	static final int NORMAL = 1;
	static final int SUPERSONIC = 2;
	
	
	
	
	
	//비행모드 1- 일반비행, 2-초음속비행
	int flyMode = NORMAL;
	
	@Override //메서드 재정의
	public void fly() {
		//조건문 - 비행기가 초음속 비행합니다.
		if(flyMode == 2) {
			System.out.println("비행기가 초음속 비행합니다.");
		}else {
			super.fly();
		}
		
		
	}
	

}
