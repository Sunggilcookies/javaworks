package twodimention;

public class TwoDimention2 {
	public static void main(String[] args) {
		//5행 5열의 2차원 배열 생성 - 문자 입력
		char[][] a = new char [5][5];
		
	
	//전체 출력(중첩 for)
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a[i].length; j++) {
			a[i][j] = '*';
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
	
	//전체 출력(중첩 for)
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<=i; j++) {
				a[i][j] = '*';
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		//전체 출력(중첩 for)
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length-i; j++) {
				a[i][j] = '*';
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	
}
	
}
