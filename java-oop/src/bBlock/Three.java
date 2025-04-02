package bBlock;
import aBlock.One;

public class Three {
	public void oneTest() {
		One one = new One();
		one.a = 1; //public
//		one.b = 2; //protected는 접근불가
//		one.c = 3; //default는 접근불가 
//		onc.d = 4; //private는 접근불가
	}
}
