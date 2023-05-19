package arrays;

public class ArrayCopy2 {
	public static void main(String[] args) {
		char[] arr1 = {'N','E','T'};
		char[] arr2 = new char[3];
		char[] arr3 = new char[3];
		
		
		
		//배열 복사
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=arr1[i]; //arr1을 arr2에 복사함
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		
		// 배열복사 거꾸로
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=arr1[(arr3.length-1)-i]; //arr1을 arr2에 복사함
			
			  
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		
	}
}


