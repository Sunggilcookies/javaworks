package fileio.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreaTest {
	public static void main(String[] args) {
	//기반 스트림 - FileInputStream
	//보조 스트림 - DataInputStream
	try(FileInputStream fis = new FileInputStream("file1.txt");
		DataInputStream dis = new DataInputStream(fis)){
		System.out.println(dis.readChar());
		System.out.println(dis.readByte());
		
		System.out.println(dis.readInt());
		System.out.println(dis.readFloat());
		System.out.println(dis.readUTF());
		
		
		
		
		
	}catch(IOException e) {
		e.printStackTrace();
	}
	
	
	
	
	}
}
