package thissample;

public class Birthday {
	int year;
	int month;
	int day;
	
	public void setYear(int year){
		this.year = year;
}

//this 객체의주소를 출력해라
public void printThis() {
	System.out.println(this);
}
}