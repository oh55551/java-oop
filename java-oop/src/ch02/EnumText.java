package ch02;


public class EnumText {
	public static void main(String[] args) {
		char gender = 'ㅁ'; // M , F 가 아닌 다른 값이 대입될 수 있다.
		
		if(gender=='M') {
			System.out.println("남자");
		}else if(gender == 'F'){
			System.out.println("여자");
		}else {
			System.out.println("잘못된 값입니다.");
		}
		
		// Enum 사용시 잘못된 값을 대입될 수 없다.
		Gender gender2 = null;
		//같은 패키지내에선 import안해도 됨(import ch02.* / import java.lang.* 은 기본으로 들어감)
		gender2 = Gender.MALE;
		
		if(gender2 == Gender.MALE) {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		
		// Enum 사용시 if보다 switch가 가동성이 높을 수 있다.
		switch(gender2) { //조건에 맞으면 그 밑에껄 다 출력하세요.
		case Gender.MALE:
			System.out.println("남자");
			break; //빠져나오게 해줌
		case Gender.FEMALE:
			System.out.println("여자");
			break; //switch나 for문에서 빠져나올때 많이씀
		}
	}

}
