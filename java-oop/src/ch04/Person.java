package ch04;

public class Person {
	public void drive() {
		Car c1 = new Car();
		c1.move(); // this->c1
		
		Car c2 = new Car();
		c2.onOff=true;
		c2.move(); // this->c2
		//c1과 c2의 this.onOff는 둘이 다른거임 그래서 위처럼 c1은 false c2는 true임
	}
}
