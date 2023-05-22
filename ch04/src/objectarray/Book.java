package objectarray;

public class Book {
	String bookName;
	String author;
	
	Book(){}  //기본생성자
	//생성자
	Book(String bookName, String author){
		this.bookName = bookName;
		this.author = author;
	}
	
	void bookInfo() {
		System.out.println(bookName+","+author);
		
		
	}
	//책이름 ㅇ입력 메서드
	void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	//책 이름을 가져오는 메서드
	String getBookName() {
		return bookName;
	}
		
	
	
	//저자입력 메서드
	void setAuthor(String author) {
		this.author =author;
	}
	
	//저자를 가져오는 메서드
	String getAuthor(){
		return author;
	}
	
	
}
