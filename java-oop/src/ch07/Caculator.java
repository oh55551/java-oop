package ch07;

public class Caculator {
	public Caculator() {
		this.power = false;
	}
	public boolean power;
	public int num;
	
	//this.num*(0.5~1.5)
	public double setRateNum(double rate) {
		double result = 0;
		if(!this.power) { //this.power == false
			System.out.println("계산기가 OFF");
		} else {
			if(!(rate >= 0.5 && rate <= 1.5)) {
				System.out.println("입력값 에러");
			}else{
				result = this.num * rate;
			}
		}
		return result;
	}
	
	
	
	public void setPower() { //void가 값을 반환하지않는건 맞지만 
							//이런 상태변환시킨거는 계속 유지됨
		this.power=!this.power; 
	}
	
	public void setNum(int num) { 
		if(this.power) { //this.power==true
			this.num = num;
		}else {
			System.out.println("계산기가 OFF");
		}
	}

	//this.num이 짝수인지 홀수인지 알고싶은 메서드
	public String checkNum() {
		String result = "";
	if(this.power == false) { //!this.power
		System.out.println("계산기가 OFF 상태");
		result = "ERROR";
	}else {	
		if(this.num % 2 == 0) {
			result = "짝수";
		}else {
			result = "홀수";
		}
		}
		return result; 
	}
}
