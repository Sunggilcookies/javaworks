package ifexample;

public class AdmissionFee {
	public static void main(String[] args) {
		// 놀이공원 입장료 계산
		// 나이별 - 8세 미만 1000, 14세미만 
		int age = 9;
		int fee=0; // 입장료 0을 기억하도록 설정함
		
		if(age < 8 ) {
			fee = 1000;
			System.out.println("취학 전 아동입니다.");
		}
		else if(age >= 8 && age < 14 ) {
			fee = 2000;
			System.out.println("초딩입니다.");
		}
		else if(age >= 14 && age < 20) {
			fee = 2500;
			System.out.println("청소년입니다.");
		}
		else{
			fee = 5000;
			System.out.println("성인입니다.");
		}
		
		System.out.printf("입장료는 %d원 입니다.",fee);
		
	}

}
