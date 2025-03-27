package ch05;

public class ClassMember {
	// 1.static : ClassMember와 무관하고 공간과 이름만을 빌려다 쓰는 요소들
	// 1-1) static method
	public static void sFun() {
		System.out.println("sFun()");
	}
	// 1-2) static field (일반필드는 생성자가 생성될때 자동으로 초기화)
	public static int x = 1;
	public static int x2 = 1+1;
	
	public static int y = (int)Math.random(); // y값이 랜덤값을 

	public static int[] arr = new int[] {1,2,3};
	public static int[] arr2 = null;
	public static int[] arr3 = new int[3];
								//자바에는 오른쪽에 ~문(for문,if문,....)은 못오고 식만 올 수 있음
	// 1-3) static block
	static {
		for(int i=0; i<ClassMember.arr3.length; i++) {
			int rNum = (int)(Math.random()+10) + 1;
			ClassMember.arr3[i] = rNum;
		}
	}
//아래처럼 이렇게 되면 count를 객체생성을 안해줘서 사용을 못하는데
// public class MyClass {
//public int count = 0;  -> public static int count=0; 으로하면 static 때문에 객체없이 사용가능 
//}
//static에는 this사용불가
	
	// 2. 생성자
	public ClassMember() { //없으면 기본형태로 자동으로 생성됨(컴파일러)
		//필드 초기화 코드가 없다면 자동으로 코드가 구현됨(컴파일러)
		this.name = "null";
	}

	
	// 3. 메서드
	public void fun() { 
		System.out.println("fun()");
	}
	// ClassMember cm = new ClassMember(); 가 있어야 cm.fun();

	// 4. 필드
	public String name;
	
	// +)그 외
	public class Inclass{} // 내부클래스
	public enum InEnum{x, y} //내부 Enum
	public interface Ininterface{}//내부 인터페이스
	public @interface InAnnotation{}//내부 애노테이션
}

//void를 쓰면 중괄호로 묶어서씀 
//그 중괄호안에서만 쓰고 리턴값(반환값)이 없는거 
//public void 를써서 중괄호안에서 int c=a+b;로하고 sysout을쓰면 c를 출력시킬수있는데 , 중괄호밖에서 sysout으로 출력하려하면 오류뜸