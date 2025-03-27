package ch07;
public class CalMain {

	public static void main(String[] args) {
		Caculator c = new Caculator();
		// c.power = true; :상태자체를 바꾸는거라 별로 좋은코드가 아님
		System.out.println(c.power); //false
		c.setPower();
		System.out.println(c.power); //true
		c.setPower();
		System.out.println(c.power); //false
		c.setNum(5);
		String result = c.checkNum();
		
		System.out.println(result);
		
		System.out.println(c.setRateNum(-0.7777));

	}
}
