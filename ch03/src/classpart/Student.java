package classpart;

public class Student {
	//클래스의 3요소 - 맴버변수, 생성자, 메서드
	// 생성자(Constructor)는 반환형이 없고 클래스이름과 동일하다.
	//생성자 오버로딩 ( 클래스와 이름은 같고, 
	//자료형과 변수이름이 다른것을말함)
	int studentID;
	String studentName;
	
	public Student() {} //기본 생성자
	
	//매개 변수가 있는 생성자
	public Student(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
	}
	// void 비어있는 함수기때문에 void 필요
	public void showInfo() {
		System.out.println("학번: " + studentID + " 이름: " + studentName);
	}
}
