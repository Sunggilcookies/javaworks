package inheritance.airplane;

public class AirPlainMain {
	public static void main(String[] args) {
		//SuperSonicAirPlane 객체 생성
		SuperSonicAirPlain sa = new SuperSonicAirPlain();
		sa.takeOff();
		sa.fly();
		sa.land();
		//초음속비행
		sa.flyMode=SuperSonicAirPlain.SUPERSONIC;
		sa.fly();
		//비행모드
		sa.flyMode=SuperSonicAirPlain.NORMAL;
		sa.fly();
				
	
		
	}
}
