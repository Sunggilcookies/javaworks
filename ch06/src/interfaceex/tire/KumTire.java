package interfaceex.tire;

//Tire을 구현한 KumTire
//implements Tire 상속받는다는뜻
public class KumTire implements Tire {

	@Override
	public void roll() {
		System.out.println("금타이어가 굴러갑니다.");
		
	}

}
