package methods;

public class random1 {
	public static void main(String[] args) {
		//Marh.random() 사용
		//주사위 10번 던지기
		for(int i =0;i<=10;i++) {
			
			int dice = (int)(Math.random()*6) +1;
			System.out.println(dice);
		}
		//문자를 난수로 추출하기
		String[] word = {"나","너","우리","세계"};
		int rnd = (int)Math.random()*4;
		
		System.out.println(word[rnd]);
		
		//로또 복권 추첨
		//번호 6개 저장할 배열 선언
		int[] lotto = new int [6];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i]= (int)(Math.random()*45)+ 1;
			//중복 문제 발생
			for(int j=0; j<i;j++) {
				if(lotto[i] == lotto[j]) { //이전번화아 일치하면
					i--;			//이젠 인덱스로 이동- 다시추천
				}
			}
		}
		//로또번호 출력
			
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i] + " ");
		}
		
		
	}
}
