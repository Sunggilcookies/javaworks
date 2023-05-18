package whileexample;

import java.util.Scanner;

public class Bank1 {
	public static void main(String[] args) {
		//은행 업부 - 예금, 출금, 잔고확인
		Scanner sc = new Scanner(System.in);
		int balance =20000; //은행 잔고
		boolean run = true; // 상태 변수
		int money; // 입출금금액
		while(run) {
			try {
				
				
				System.out.println("========================");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("========================");
				System.out.println("선택>");
			
				int selNum = Integer.parseInt(sc.nextLine());
				switch(selNum) {
				case 1: 
					System.out.print("예금액>");
					// 잔고는 잔고 + 예끔
					money = Integer.parseInt(sc.nextLine());
					balance += money;
					System.out.printf("%d 정상처리 되었습니다.\n",money);
					break;
				case 2: 
					System.out.print("출금액>");
					// 잔고는 잔고 -출금
					money=Integer.parseInt(sc.nextLine());
					balance -= money;
					System.out.printf("%d 정상처리 되었습니다.\n",money);
					break;
				case 3:
					System.out.print("잔고>" + balance);
					break;
				case 4:
					run = false;
					break;
				default:
					System.out.println("메뉴를 잘못 선택하셨습니다. 다시입력해주세요");
					break;
				}
			
			}catch(Exception e) {
				System.out.println("잘못된 입려깁니다. 다시입력해주세요");
			}
		}//while 닫기
		System.out.println("프로그래램을 종료합니다.");
		sc.close();
			
	}
}
