package enums;

public class SeasonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season season = null; 	//null/로 초기화
		season = Season.여름;
		
		switch(season ) {
		case 봄:
			season=Season.봄;
			break;
		case 여름:
			season=Season.여름;
			break;
			
		}
		System.out.println(season);
		
		
	}

}
