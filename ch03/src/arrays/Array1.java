package arrays;

public class Array1 {

	public static void main(String[] args) {
		// 정수 5개를 저장할 배열 선언
		int[] arr = new int[5];
		arr[2] = 7;
		
		for(int i=0;i<5;i++){
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
		//5개의 크기를 가진 정수형 배열 선언
		int[] arr2 = {2, 4, 6, 8, 10};
//		System.out.print(arr2[1]);
		
//		전체 츌력
		for(int j=0;j<arr2.length;j++) {
			System.out.println(arr2[j]+ " ");
		}
			
		
		
	}

}
