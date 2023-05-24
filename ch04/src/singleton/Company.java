package singleton;

public class Company {
	
	//유일하게생성한 인스턴스(Compny클래스의 객체)
	private static Company instance;
	
	//기본 생성자
	private Company() {}
	
	// instance에 접근할(사용) 메서드 생성
	public static Company getInstance() {
		if(instance == null ) {
			instance = new Company();
			
		}
	
	return instance;
	}
}
