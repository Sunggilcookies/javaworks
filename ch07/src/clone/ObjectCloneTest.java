package clone;

public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(3,4,5);
		
		//circle 객체 복사
		//오른쪽은 오브젝트 왼쪽은 자료형이라 크기 맞춰저야행
		Circle copyCircle = (Circle)circle.clone();
		
		System.out.println(circle); 
		System.out.println(copyCircle); 
		
	}
	
}
