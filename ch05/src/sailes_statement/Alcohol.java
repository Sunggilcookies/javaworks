package sailes_statement;

public class Alcohol extends Drink {

	protected float alcper; //알콜도수
	
	//생성자
	public Alcohol(String name, int price, int count, float alcper){
		super(name, price, count);
		this.alcper = alcper;
	}
	
	//제목 출력
		public static void printTitle() {
			System.out.println("상품명\t가격\t수량\t금액");
		}

		
		@Override
		public void printData() {
			// TODO Auto-generated method stub
			System.out.printf("%s(%.1f) %d    %d    %d", name, alcper,
					price, count, getTotalPrice());
		}
		
		
		
}
