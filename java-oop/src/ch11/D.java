package ch11;

public class D extends C { // extends A -> extends C
						   // 즉 D는 A+C 모두 갖음
	public int k;
	public D() {
		super(); // super는 부모생성자를 호출->즉 C를 호출
				 // 부모생성자 호출 C()->A()
		this.k=0;
		//this .....
		
		//Ojbect : super.super.super
		//A() : x , name, m1()
		//C() : z, m3()
		//D() : k
	}
	
	public static void main(String[] args) {
		D d = new D();
		d.x = 1; //this.x없음->super.x없음->super.super.x 있음 
		d.z = 2; //this.z없음->super.z있음
		d.k = 3; //this.k있음
		d.name = "goodee";
		d.m1();
		
	}
}
