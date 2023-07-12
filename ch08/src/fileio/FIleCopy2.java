package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleCopy2 {

	public static void main(String[] args) {
		//이미지 파일을 읽고 쓰기9ㅂ고사)
		
		String originFile = "c:/file/bg0.jpg"; //원본 파일
		String copyFile = "c:/file/bg2.jpg"; //사본 파일
		long start = 0, end = 0;
		
		try(FileOutputStream fos = new FileOutputStream(copyFile);
			FileInputStream fis = new FileInputStream(originFile)){
			start= System.currentTimeMillis();
			
			int i;
			while((i = fis.read()) != -1) {
				fos.write(i);
			}
			end = System.currentTimeMillis();
		
		}catch(IOException e) {
			e.printStackTrace();
		}	
			
//		System.out.println("파일 복사 소요시간:"+(end-start) + "ms");
		System.out.printf("파일 복사 소요시간: %dms\n",(end-start));
	}//main 끝
}
