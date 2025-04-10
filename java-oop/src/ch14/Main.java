package ch14;

public class Main {
	public static void main(String[] args) {
		Person p = new Person();
		
		Dog d = new Dog();
		p.withWalk(d);
		
		Snake s = new Snake();
		p.withWalk(s);
		
		Kangaroo k = new Kangaroo();
		p.withWalk(k);
		
		//다형성으로 코드가 줄어듬->아주 좋아짐
		
		//Pet p = new Pet(); 에러
		//p.move();
	}
}
