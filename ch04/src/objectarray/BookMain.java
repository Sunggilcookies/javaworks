package objectarray;

public class BookMain {

	public static void main(String[] args) {
		//Book 객체 생성 -책ㄱ 권
		Book[] library =new Book[5];

		//배열의 자 료가 
		for(int i=0; i<library.length; i++) {
			if(library[i] != null) {
				library[i].bookInfo();
			}
		}
						
		
		
		//자료 저장
		library [0] = new Book("반응형 웹사이트", "김은아");
		library [1] = new Book("Tiny Python Project","켄 유엔스-클락");
		library [2] = new Book("혼자 공부하는 자바","신용권");
		library [3] = new Book("Tiny Python Project","켄 유엔스-클락" );
		library [4] = new Book("Tiny Python Project","켄 유엔스-클락" );
	
		
//		for(int i=0; i<library.length; i++)
//			// 배열의 저장되지 않은 공간이 있을때 반드시명시
//			if(library[i] !=null) {
//				library[i].bookInfo(); 
//			}
//	}
//		
		//향상된 for
		for(Book book : library) {
			//book객체가 null이 아니면 출력
			if(book != null) {
			book.bookInfo();	
		
			}
		
		}
	}
}

		
		
		
