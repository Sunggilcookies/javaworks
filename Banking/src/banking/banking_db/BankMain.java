package banking.banking_db;

import java.sql.SQLException;
import java.util.Scanner;

import banking.bankarray.Account;

public class BankMain{

	// 통장 계좌를 만들 객체 배열 100개 생성


	public static void main(String[] args) {
		AccountDao dao = new AccountDao();
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
	try {	
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.삭제 | 6.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택> ");
			
			//메뉴 선택 변수
			int selectNo = Integer.parseInt(scanner.nextLine()); //문자형을 숫자형으로 변환
			
			if(selectNo == 1) {
				dao.createAccount();
//				createAccount();  //계좌 생성
			}else if(selectNo == 2) {
				dao.getAccountList();
//			    getAccountList(); //계좌 목록
			}else if(selectNo == 3) {
				dao.deposit();
//			    deposit();        //예금
			}else if(selectNo == 4) {
				dao.withdraw();
//			    withdraw();        //출금
			}else if(selectNo == 5) { //계좌 삭제
				dao.deleteAccount();
				
			}else if(selectNo == 6) {
				run = false;
				System.out.println("프로그램을 종료합니다.");
			}else {
				System.out.println("지원되지 않는 기능입니다. 다시 입력해주세요");
			}
		}//while() 끝
		scanner.close();
	}catch (NumberFormatException e) {
		System.out.println("오류입니다. 재실행해주세요");
	}catch (Exception e) {
		System.out.println("입니다. 재실행해주세요");
	}
	}//main() 끝
	

	
}//Main 클래스 끝
	
