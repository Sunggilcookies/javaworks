package interfaceex.tire;

public class CarMain2 {
	public static void main(String[] args) {
		
		//Car 객체 생성
		Car2 myCar = new Car2();
		myCar.run();
		
		System.out.println("===========================");
		
		//앞바퀴 2개 교체 --myCar에 들어가서 직접접근
		myCar.tires[0] = new KumTire();
		myCar.tires[1] = new KumTire();
		myCar.run();
	}
}
