package interfaceex.tire;
//객체배열
public class Car2 {

	Tire[] tires = {
		new HanTire(), //0번위치	
		new HanTire(), //1번인덱스
		new KumTire(),
		new KumTire()
	};
	
	//메서드
	public void run() {
//		for(int i=0;i<tires.length;i++) {
//			tires[i].roll();
//		}
		for(Tire tire : tires)
			tire.roll();
	}
	
	
	
	
	
}
