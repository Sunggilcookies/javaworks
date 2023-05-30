package db;

//V0 (Value Object) - 자료형
public class Person {
	//필드(db테이블 - 칼럼명)
	private String userId;
	private String userPw;
	private String name;
	private int age;
	
	//기본 생성자
	public Person() {}
	
	//외부입력가능한 생성자
	//필드 (DB 테이블 -칼럼명)
	public Person(String userId, String userPw,
			String name, int age) {
		this.userId = userId;
		this.userPw = userPw;
		this.name = name;
		this.age = age;
	

	}
	
	//PRIVATE이기에 함수를 거쳐서 나오게함
	//setter, getter
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
