package ch04;

public class Car {
	public Car() {}
	public boolean onOff;
	public void move() {
		if(this.onOff) { //this는 self 같은 느낌으로 생각하면될듯 (나중에 객체를 만들었을때 어떻게 만들어질지모르니 this를 씀)
			System.out.println("자동차 Move!");
		}else {
			System.out.println("시동부터....");
		}
	}

}
