package statics;

public class OneUp2 {
	
	//프로그램이 종료될때 소멸하고, 갑을 꼐속 유지 
	static int x= 0;
	public static int oneUp() { //static이 붙은 변수x 는 정적변수위ㅏ.
		x = x + 1;
		return x;
	}
	
	public static void main(String[] args) {
		
		System.out.println(oneUp());
		System.out.println(oneUp());
		System.out.println(oneUp());
		
		System.out.println(x);
	}

}
