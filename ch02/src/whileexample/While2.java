package whileexample;

public class While2 {
	public static void main(String[] args) {
		int i = 0;
		int sumVal =0;
		
		while(true) {
			i++;
			if(i>10) {
				break;
			}
			sumVal += i;
			System.out.println(i);
			
			
		}
		System.out.println(sumVal);
	}
}
