package fileio.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("file1.txt");
			DataOutputStream dos = new DataOutputStream(fos)){
			dos.writeChar(67); //문자
			dos.writeByte(64); //정수
			dos.writeInt(65); //정수
			dos.writeFloat(2.45F); //실수
			dos.writeUTF("안녕하세요");
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("수행완료");
	
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
