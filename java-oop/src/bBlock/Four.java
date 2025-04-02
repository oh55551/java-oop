package bBlock;
import aBlock.One;

public class Four extends One {
	public void oneTest() {
		this.a = 1; //public 
		this.b = 2; //protected 
//		this.c = 3; default는 상속받아도 못씀
//		this.d = 4; private는 상속받아도 못씀
	}
}
