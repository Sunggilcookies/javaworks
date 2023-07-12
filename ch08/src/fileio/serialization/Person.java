package fileio.serialization;

import java.io.Serializable;
public class Person implements Serializable{
	


	private static final long serialVersionUID = 10L;
	//필드
	String name;
	String job;
	
	//생성자
	public Person(String name, String job) {
		this.name= name;
		this.job = job;
	}
	
	@Override
	public String toString() {
		return name + "," + job;
	}
}
