package methods;

public class Method1 {
	
	//main()함수
	public static void main(String[] args) {
		//객체 (크래스에서 만드는 인스턴스)
		Method1 method = new Method1();
		
		System.out.println(method);
		
		//함수 호출
		sayHello();
		
		System.out.println(square(4));
	
	
	}
	
	
	//sayHello() 함수생성
	//sayHello() 사용(호출), 객체 이름.함수이름()
			// static을 붙인 이유 - 호출하는 쪽에서 new 객체 생성을 하지 않을때 사용
	public static void sayHello() {
		System.out.println("Hello~");
	}
	//제곱수를 계산한느 함수(return 있는 함수 - int형으로 반환)
	public static int square(int x) {
		return x * x;
	}
}
