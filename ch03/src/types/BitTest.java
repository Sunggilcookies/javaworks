package types;

public class BitTest {
	public static void main(String[] args) {
		// 2진수, 16진수 표기
		int num = 10;
		int bNum = 0b1010; //2진수 -접두어(0b) qnxdla
		int hNum = 0xA; // 16진수 - 접두어(0x)붙임
		
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(hNum);
		
		// 2진수 - 32bit
		// 음수 만드는법(2의 보수) 1. 1의 보수(1-0)를 표기 2.맨뒤에 1을 더함
		int num1 = 0b0000000000000000000000000000011; //2
		int num2 = 0b11111111111111111111111111111101; //3
	
		
		
		System.out.println(num1);
		System.out.println(num2);
		
	
		
		
		
		
		
		
	}
}
