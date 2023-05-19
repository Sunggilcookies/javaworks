package methods;

import java.util.Scanner;

public class CalcScore {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true; //상태 변수
		int[] scores = null; 
		
		while(run) {
			try {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3.점수리스트 | 4.분석 | 5. 종료");
			System.out.println("-----------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			//학생수를 입력하지 않았다면
			if(scores == null){ 
				switch(selectNo) {
				case 1: 
					System.out.print("학생수> ");
					int studentNum = Integer.parseInt(sc.nextLine());
					scores = new int[studentNum];
					break;
				case 2: case 3: case 4: case 5: {
					System.out.print("1번을 먼저 선택해주세요");	
					break;
					}
				default : System.out.println("지원하지 않는 메뉴입니다. 다시선택해주세요");
				}//switch문
			}
		
			//학생수를 입력했다면
			else if(scores != null){ 
				switch(selectNo) {
				case 1: 
					System.out.print("학생수> ");
					int studentNum = Integer.parseInt(sc.nextLine());
					scores = new int[studentNum];
					
				case 2:
					System.out.print("점수 입력> ");
					for(int i =0; i<scores.length; i++){
						System.out.print("scores[" + i +"]>");
						scores[i] = Integer.parseInt(sc.nextLine());
					}	
					break;
				case 3:
					for(int i =0; i<scores.length; i++){
					System.out.println("scores[" + i +"]>" + scores[i]);	
					}	
					break;
				case 4:
					//분석 - 총점,평균,최고점수
					int sumV = 0; double avg=0; int maxV= scores[0]; //최대값은 첫번짹밧으로 설정
					for(int i=0; i<scores.length; i++) {
						sumV += scores[i]; //누적합계
						if(maxV < scores[i]) //다음 점수가 최대값보다 크면
							maxV = scores[i]; //점수를 최대값으로 설정함
					}
					avg = (double)sumV / scores.length;
					
					System.out.println("총점: " + sumV);		
					System.out.println("평균" + avg);		
					System.out.println("최대값: " + maxV);		
					break;
				case 5:
					run=false;
					System.out.print("프로그램을 종료합니다.");		
					break;
				default : 
					System.out.println("지원하지 않는 메뉴입니다. 다시선택해주세요");
				}
			
			}
			}//try문
			catch(Exception e) {
				System.out.println("올바른선택이 아닙니다. 다시 선택해주세요");
			}
			
		}//while문	(run)
		
		
		
	//퍼블릭구문	
	}
}
