package ch06;

public class CarMain {

	public static void main(String[] args) {
		/*
		  Car c = new Car();
		System.out.println(c.is);
		System.out.println(c.num);
		*/
		/*
		Car c = new Car(7);
		System.out.println(c.num);
		System.out.println(c.is);
		
		Car c1 = new Car(99, true);
		System.out.println(c1.num);
		System.out.println(c1.is);
		*/
		
		Car c1 = new Car();
		Car c2 = new Car(7, true);
		c1.print();
		c2.print();
	}

}
