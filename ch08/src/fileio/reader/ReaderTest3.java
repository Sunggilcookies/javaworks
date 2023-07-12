package fileio.reader;


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


public class ReaderTest3 {
	public static void main(String[] args)  {
		//close()를 하지않는 방법
		//try ~with ~resource문
		try(Reader fr = new FileReader("data.txt")){
			int data;
			
			while((data=fr.read())!= -1) {
				System.out.println((char)data); //문자로 출력
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}}

