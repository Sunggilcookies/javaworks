package arrays;

public class Array1to10 {
	public static void main(String[] args) {
		//1부터 10까지출력 - 변수사용
		int sum1=0;
		for(int i=1; i<=10; i++) {
			sum1 += i;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("합게: " + sum1);
		
		
		// 1부터 10 까지 출력 -배열사용
		int[] arr = new int[10];
		for(int i=1; i<=10; i++) {
			arr[i-1]=i;
			System.out.print(arr[i-1] + " ");
		}
		System.out.println();
		
	}
}
