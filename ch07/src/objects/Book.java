package objects;

public class Book {

	//필드
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	//메서드 재정의

	//toString 재정의
	public String toString() {
		return bookNumber + ", " + bookTitle; 
	}

	//equals 재정의
	public boolean equals(Object obj) {
		//강제 형변환
		if(obj instanceof Book) { //obj의 Book의 객체라면 
			Book book= (Book)obj; //강제 형변환
			if(this.bookNumber == book.bookNumber)
				return true; //true 변환
			
			
		}
		return false;
	}
	//hashCode() 재정의
	@Override
	public int hashCode() {
		return bookNumber; //해시코들르 반환값과 같은 의미
	
}
}