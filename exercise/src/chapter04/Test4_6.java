package chapter04;

public class Test4_6 {
	public static void main(String[] args) {
//		for(int x=1;x<5;x++){
//			for(int y=0;y<4-x;y++) {
//				
//				System.out.printf(" ");
//			}
//			for(int y=0;y<x;y++) {
//				
//					System.out.printf("*");
//				}
//				System.out.println();
//			}
		for(int x=1;x<5;x++){
			for(int y=3;y>=0;y--) {
			if(y>=x) {
				System.out.printf(" ");
			}else {
				System.out.printf("*");
			}
			}
			System.out.println();
		}
		// 2번쨰 방법
		//(x , y) y가 x보다 같거나클때는 공백 작을땐 x  (1,321||0일때는 *) (2,32||10일때는 **)(3,3||210)
}
}
