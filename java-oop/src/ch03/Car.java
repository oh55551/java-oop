package ch03;

public class Car {
	public Car() {} //생성자 ->이건 만들어도 안만들어도 생김 / 없으면 컴파일러에 의해 자동 생성
	
	
	public boolean onOff;
	public String name;
	public String color;
	
	public void move() {
		System.out.println("move");
	}
}
