package ch06;
import java.util.ArrayList;

public class Car {
	public int num; 
	public boolean is;
	public String arr;   
	public ArrayList<String> list;
	
	
	
	//생성자 오버로딩 

	public Car() {
		this.num = 1;
		this.is = true;
		this.arr= "test";
		this.list = new ArrayList<String>();
		list.add("t");
		list.add("b");
		//필드 초기화 코드도 자동으로 추가
		//필드는 초기화의 규칙이 필요
		//생성자가 없으면 컴파일러 기계어로 변경할때
		//기본생성자(매개값이 없는) 모양으로 자동으로 추가함.
	}

	
	// 일반생성자 (값 하나 지정해주면 다른것도 다 지정해줘야함)
	public Car(int num) {
		//컴파일러가 일반 생성자가 존재하므로 기본생성자를 추가하지 않는다.
		//생성자안에 필드초기화 코드가 없다 - > 컴파일러가 자동으로 추가
		this.num=num; //앞 뒤 num이 다름
	}
	//기본 생성자는 매개변수가 없고, 값을 명시적으로 지정해서 필드를 초기화할 수 있습니다. 값이 지정되지 않으면 기본값으로 초기화됩니다.
	//일반 생성자는 매개변수를 받아, 전달된 값으로 필드를 초기화하고, 전달되지 않은 값은 기본값으로 남습니다.
	
	public Car(boolean is) {
		this.is=is; //
	}
		
	public Car(int num, boolean is) {
		this.is=is; 
		this.num=num;
	}
	
	//메서드 오버로딩(생성자가 같은데 매개값만 다른거)
	public void test() {}
	public void test(int x) {}
	
	//this 
	public void print() {
		System.out.println(this.num);
	}
}