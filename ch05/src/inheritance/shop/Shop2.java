package inheritance.shop;

public class Shop2 extends HeadShop{
	//생성자
	public Shop2() {
		System.out.println("역세권 매장입니다.");
	}
	
	@Override
	public void sellDoenjangJJige() {
		System.out.println("된장찌게7000원");
	}

	@Override
	public void sellKimchiJJige() {
		System.out.println("김치찌게:7500원");
	}

	@Override
	public void sellBibimBap() {
		System.out.println("비빔밥:7500원");
	}
}
