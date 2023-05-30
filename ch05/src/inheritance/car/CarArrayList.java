package inheritance.car;

import java.util.ArrayList;

public class CarArrayList {
	
	public static void main(String[] args) {
		  // Car 객체를 담을 어레이리스트 공간 생성
		ArrayList<Car> carList = new ArrayList<>();
		
		//자동차 3대 생성 - ArrayList에 저장
		Car car1 =new Car("Sonata", 1000);
		Car car2 =new Car("avante", 2000);
		Car car3 =new Car("audi",2500);
		
		
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
	
		//익명객체
		System.out.println(car1.carInfo());		
	       
		//특정한요소 1개 검색
		System.out.println(carList.get(1).carInfo());
		
		//전체요소 출력
		for(int i=0;i<carList.size();i++) {
			Car car = carList.get(i);
			System.out.println(car.carInfo());
			
		}
			
		
	}//main 끝
		
}
