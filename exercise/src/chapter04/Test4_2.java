package chapter04;

public class Test4_2 {
	public static void main(String[] args) {
		

	int sumV = 0;
	for(int i=0; i<=100;i++) {
		
		if(i%3==0) {
		
			sumV += i;
		}
	}
	System.out.println("3의배수 총 합은" + sumV);
 }	
}
