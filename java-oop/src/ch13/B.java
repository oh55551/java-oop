package ch13;

public class B extends A{
	// 변수앞에 붙어있는 final은 상수개념이라 생각하면됨
	public int add(final int x ,final int y) {
		return x+y;
	}
	
	@Override
	public void test() {
	}
}
