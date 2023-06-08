package systems;

public class SystemExit {
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			if(i == 5) 
				break;	//for문을 빠져나옴
//				System.exit(0); //main()함수에서 빠져나옴
			System.out.println(i);
		}
		
		System.out.println("반복종료");	
		
	}
}
