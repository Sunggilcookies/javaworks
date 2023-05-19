package classpart;

//원은 점 클래스(자료형)를 팜조하고 있음
public class Circle {
	
	Point center; //Point 클래스를 맴버 변수로 사용
	int radius;
	
	public Circle(int x, int y, int radius) {
		center = new Point(x, y); //중심점 생성
		this.radius= radius; //반지름
	}	
	
	//원의 정보 출력 메서드 void는반환할때
	public void showInfo() {
		System.out.printf("원의 중심은 (%d, %d)이고, 반지름은 %d입니다\n.",
				center.x, center.y, radius);
	}
}
