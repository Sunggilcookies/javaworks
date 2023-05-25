package fruits;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println(
				"1.포도 | 2.바나나 | 3.복숭아");
		System.out.println("선택> ");
		Fruit fruit = null;
		int menu = Integer.parseInt(scan.nextLine());
		if(menu ==1) {
			fruit = new Grape();
			
		}else if(menu ==2) {
			fruit = new Banana();
			
		}else if(menu ==3) {
			fruit = new Peach();
			
		}
		fruit.showInfo(); // 각 객체의 정보 출려(가상 메서드)
		scan.close();
	}
}	

