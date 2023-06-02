package shelf;

public class BookShelfTest {
	
	public static void main(String[] args) {
		//BookShelf의 객체 생성
		BookShelf bookShelf = new BookShelf();
		
		bookShelf.enQueue("반응형 웹"); //책장 책 1권 넣음
		bookShelf.enQueue("혼공 Java"); //책장 책 1권 넣음
		
		//리스트 요소의 개수		
		System.out.println(bookShelf.getSize()+"권");
		
		//자료 출력
		System.out.println(bookShelf.deQueue());
		System.out.println(bookShelf.deQueue());
		
				
	}
}
