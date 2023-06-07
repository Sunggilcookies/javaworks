package clone;

public class Point {
	int x;
	int y;
	
	Point(int x, int y){
		this.x =x;
		this.y =y;
	}

	@Override
	public String toString() {
		
		return "점의 좌표 x는"+x+"이고 y는"+y+"입니다.";
	}
}
