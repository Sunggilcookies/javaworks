package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleCopy1 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		//이미지 파일을 읽고 쓰기9ㅂ고사)
		
		String originFile = "c:/file/bg0.jpg"; //원본 파일
		String copyFile = "c:/file/bg1.jpg"; //사본 파일

		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		int i;
		
			try {
			fis = new FileInputStream(originFile);
			fos = new FileOutputStream(copyFile);
			while((i = fis.read()) != -1) {
			
					fos.write(i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			System.out.println("복사완료");
}//main 끝
	}
