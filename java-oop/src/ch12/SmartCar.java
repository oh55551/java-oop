package ch12;

public class SmartCar extends Car{
	public String display;
	public String color = "파랑";
	public SmartCar() {
		super(); //super.color = "노랑";
		this.display = null;
	}
	// super.onOff() 
	
	public void print() {
		//System.out.println(super.color); // 노랑
		//System.out.println(this.color);	//	파랑
		//System.out.println(color);	//		파랑
	}
	
	//@Override를 써놓으면 확인용으로 활용가능(부모가 가지고있는걸 자식에서 재정의)
	public void onOff() {
		
	}
	
	public static void main(String[] args) {
		SmartCar sc = new SmartCar();
		sc.onOff();
		
		
		//모든 클래스는 object를 상속받게돼있음.
		
		
		// sc.display="삼성"; //this
		// sc.color="빨강";	//super
		//System.out.println(sc.display); //부모필드 hiding되기 때문에 this만 호출
		//System.out.println(sc.color);
		//sc.onOff();	//super
		//sc.print();
		
		
		//cf
		Car c = (Car)new SmartCar();
		c.onOff();	//super
		if(c instanceof SmartCar) { //c를 smartCar로 형변환해도되는지
		((SmartCar)c).print(); //강제로 형변환한거임->위험함
							  //참조타입끼리는 막 형변환가능하긴함
		}
		
		String s = new String();
		//((SmartCar)s).print(); 이건안됨
		
		Car c2 = new Car();
		if(c instanceof SmartCar) {
			((SmartCar)c2).print();
		}
	}
}
