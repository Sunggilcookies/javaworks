package fileio.decorator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
	public static void main(String[] args) {
		//문자열 읽어오기 - 보조 스트림 사용
		try (FileReader fr = new FileReader("msg.txt");
			BufferedReader br = new BufferedReader(fr)){
				
			
			String line =null;
			while(true) {
				line =br.readLine();
				if(line == null) break;
				System.out.println(line);
			}	
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
