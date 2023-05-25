//taxi랑 qjtm showinfo 안

package transport;

public class Main {
	
	public static void main(String[] args) {
	//사람객체생성
		Person p1 = new Person("조혜원", 10000);
		Person p2 = new Person("안민상", 20000);
		
		
		//버스객체 생성
		Bus bus740 = new Bus("bus740");
		
		//택시 객체 생성
		Taxi 타다 = new Taxi("h");
		
		p1.take(타다,1300);
		p2.take(bus740, 1000);
		p2.take(타다, 1000);
		
		p1.showInfo();
		p2.showInfo();
		
		

		
}
}
