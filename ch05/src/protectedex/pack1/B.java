package protectedex.pack1;

public class B {
	
	
	
	public void method() {
		//같은 패키지내에서는 protected 접근 제한자 사용됨
		
		A a = new A();
		a.filed = "ok";
		a.method();
	}
}
