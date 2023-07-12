package fileio;

import java.io.IOException;

public class SystemTest2 {
	public static void main(String[] args) throws IOException {
		System.out.println("여러개의 문자를 입력하고[Enter]를 누르세요");
		
		
		int readByte;
		
		//구현1.
		while(true) {
			readByte=System.in.read();
			if(readByte==-1) break;
			System.out.println((char)readByte);
		}
		//구현2.
		int data;
		while((data= System.in.read()) != -1) {		
			System.out.println((char)data);
		}
		
		
//		while(true) {
//			try {
//				readByte=System.in.read();
//				if(readByte == -1) break;
//				System.out.println((char)readByte);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}
}
