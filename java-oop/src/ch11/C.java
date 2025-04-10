package ch11;

// is (상 속 관 계) 
public class C extends A { // 상속은 단일상속만 가능
	public int z;
	public void m3() {
		System.out.println("m3");
	}
	
	public static void main(String[] args) {
		C c  = new C();
		c.x = 1;
		c.name = "hi";
		c.m1();
		c.z=2;
		c.m3();
		
	}
}
