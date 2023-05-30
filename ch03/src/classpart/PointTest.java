package classpart;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point1 = new Point(3,4);
		Point point2 = new Point(10,40);
		// 직접 맴버 변수에 접근방식은 좋지않음
		//point.x =3;
		//point.y =4;
		
		//직접맴버 호출 
		System.out.println("점(" + point1.x + "," + point1.y + ")");
		System.out.println("점(" + point2.x + "," + point2.y + ")");
		
	}

}
