package aBlock;

public class One {
	public int a;
	protected int b;
	int c; // default(아무것도안하는거)
	private int d; //private는 다른메서드에서 호출불가능(가장 작은범위의 허용)
	
	public void test() { //접근제한자는 사용가능
		this.a = 1;
		this.b = 2;
		this.c = 3;
		this.d = 4;	//private도 동일한 클래스내 메서드에서는 가능
	}
}
