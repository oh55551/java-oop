package ch09;
import java.util.*;
public class MethodEx2 { 
	// method에서 this가 없으면 일반메서드나 static이 되어도됨 (즉, static에는 this가 없음)
	// static 메서드 안에서는 객체 자체(this)가 없기 때문에 this를 사용할 수 없음
	
	// 요구사항: 반환타입 숫자
	// 		매개타입 배열 : 배열
	// 		배열.length API 금지!
	// 		배열을 입력하면 반환값으로 배열의 길이 반환
	public int m24a(int[] arr) {  // ex) int x = new int[7]
		int result = 0; //arr.length사용금지
			for(int i : arr) {
				result++;
			}
		return result;
	}
	
	public int m24b(int[] arr) {
		int i=0;
		boolean flag = true;
		while(flag) { // 무한루프
			try { //try에서 예외가 발생하면 catch문을 하겠다
			int temp = arr[i];
			}catch(Exception e) {
				return i;
			}
			i++;
		}
		return i; //두 번째 return은 "혹시라도 예외가 안 났을 경우를 대비한 코드"
	}

	//Student타입을 디버깅한 문자열을 반환하는 메서드 반환타입: String / 매개타입:클래스하나
	public String m25a(Student s) {
		String result = "";
		result += "번호는 "+ s.num+"이고, 이름은"+ s.name +"입니다.";
		return result;	// 번호는 ?이고, 이름은 ?입니다.
	}
	
//	반환타입 boolean 매개타입 클래스두개
	public boolean m24c(Student s1, Student s2) {
		boolean result = false;
		// s1, s2 를 비교하는 코드
		if(s1.num == s2.num && s1.name.equals(s2.name)) {
			result = true;
		}
		return result;
	}
	
	//반환타입:배열
	//매개타입:List
	//List를 입력받아서 배열로 변경하여 반환
	public int[]m4a(ArrayList<String> list){ //문자열로 된 숫자 리스트를 → 정수 배열로 바꾸고 출력하는 코드
		int[] result = new int[list.size()];   // list의 크기만큼 정수 배열 만들기
		int i = 0;
		for(String s : list) { // 리스트 안의 문자열을 하나씩 꺼내서
			result[i]=Integer.parseInt(s);	// 문자열을 정수로 바꿔서 배열에 저장
			i++;
		}
		return result;
	}
	
	//{과제}
	// 반환타입:배열
	// 매개타입:int
	//252->{2, 5, 2}
	public int[] m5a(int num) {
	    int tmp = num; 
	    int length = 0; // 자리수(배열 길이)를 셀 변수
	    while (num > 0) { //숫자 하나씩 뽑아내기위한 코드
	    num /= 10; //num=num/10;
	    length++; 
	}
	    int[] result = new int[length];  // 자릿수 크기만큼 배열 생성
	    for (int j = length - 1; j >= 0; j--) { // 뒤에서부터 채움
	        result[j] = tmp % 10;
	        tmp = tmp / 10;
	    }
	    return result;
	}
	
	//252->{"2","5","2"}
	public String[] m5b(int num) { // substring() 메서드 
		String[]result = null;
		String str = num+""; //"252"
		result = new String[str.length()]; // new String[3]
		for(int i=0; i<result.length; i++) {
			if(i != result.length-1) {
				result[i] = str.substring(i, i+1); // (0, 1) (1, 2)
				//substring(0,1)인덱스 0부터 시작해서, 인덱스 1 이전까지 잘라라!
			}else {
				result[i] = str.substring(i);
			}
		}
		return result;
	}
	
	
	//반환타입:클래스
	//입력타입:int, String
	public Student m6a(int num, String name) {
		Student s = new Student();
		s.num=num;
		s.name=name;
		return s;
	}
	
	//반환타입:Student[]
	//매개타입:List<Map>
	public Student[] m7a(ArrayList<HashMap<String, Object>> list) {
		Student[] arr = new Student[list.size()];
		int i = 0;
		for(HashMap<String, Object> m : list) {
			arr[i] = new Student();
			arr[i].num = (Integer)(m.get("num"));
			arr[i].name = (String)(m.get("name"));
			i++;
		}
		return arr;
	}
	
	//반환타입:List<String>
	//매개타입:임의의 개수의 문자열
	public ArrayList<String> m8a(String...name){ //...의 의미는 문자열이 몇개들어올지 모르겠다.
		ArrayList<String> result = new ArrayList<String>();
		for(String n : name) {
			result.add(n);
		}
		return result;
	}
	
	//반환타입:Map
	//매개타입:student
	public HashMap<String, Object> m9a(Student s){
		HashMap<String, Object> result
		=new HashMap<String, Object>();
		result.put("num", s.num);
		result.put("name", s.name);
		return result;
	}
}
