package polymorphism;


class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

//Human 클래스
class Human extends Animal{
	public void move() {
		System.out.println("사람이 움직입니다.");
	}
}

//Tiger 클래스
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이 움직입니다.");
	}
}
//Ealge 클래스
class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 움직입니다.");
	}
}



public class AnimalTest {
	public static void main(String[] args) {
		
		
		AnimalTest aTest = new AnimalTest();
		//다형성 - 부모타입으로 객체생성 (자동형변환)
		Animal animal = new Animal();
//		animal.move();
		Animal human= new Human();
//		human.move();
		Animal tiger= new Tiger();
		Animal eagle= new Eagle();
//		tiger.move();
		moveAnimal(human);
		moveAnimal(tiger);
		moveAnimal(eagle);
		
	}
	//move()를 사용할 메서드 생성
	public static void moveAnimal(Animal animal) {
		animal.move();
		
	}
}
