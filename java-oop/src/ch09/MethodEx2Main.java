package ch09;
import java.util.*;

import java.util.ArrayList;

public class MethodEx2Main {
	public static void main(String[] args) {
		MethodEx2 m2 = new MethodEx2();
		
		Student s9 = new Student();
		s9.num = 99;
		s9.name = "티치";
		HashMap<String, Object> map9
		=m2.m9a(s9);
		System.out.println(map9.get("num"));
		System.out.println(map9.get("name"));
		
		
		System.out.println("-------------------");
		
		ArrayList<String> nameList
		=m2.m8a("루피","조로","상디");
		for(String n: nameList) {
			System.out.println(n);
		}
		System.out.println("-------------------");
		
		
		ArrayList<HashMap<String, Object>> list7
			=new ArrayList<HashMap<String, Object>>();
		HashMap<String, Object> map1
			=new HashMap<String, Object>();
		map1.put("num", 11);
		map1.put("name", "샹크스");
		list7.add(map1);
		
		HashMap<String, Object> map2
		=new HashMap<String, Object>();
		map2.put("num", 21);
		map2.put("name", "버기");
		list7.add(map2);
		
		HashMap<String, Object> map3
		=new HashMap<String, Object>();
		map3.put("num", 31);
		map3.put("name", "프랑키");
		list7.add(map3);
		
		Student[] arr = m2.m7a(list7);
		for(Student s : arr) {
			System.out.println(m2.m25a(s));
		}
		//--
		Student student = m2.m6a(8, "로빈");
		System.out.println(m2.m25a(student));
		
		System.out.println("-------------------");
		
		int num=252222;
		int[] result11 = m2.m5a(num);
		System.out.println(Arrays.toString(result11));
		
		System.out.println("-------------------");
		
		// 
		String[] result2 = m2.m5b(num);
		for(String s : result2) {
			System.out.println(s);
		}
		
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("101");
//		list.add("200");
//		list.add("999");
//		int[] result = m2.m4a(list);// 문자열 리스트를 정수 배열로 변환
//		if(result!=null) {
//			for(int n : result) {
//				System.out.println(n); // 101 200 999
//			}
//		}
		
		
		Student s = new Student();
		s.num = 2;
		s.name = "조로";
		Student s2 = new Student();
		s2.num = 3;
		s2.name = "나미";
		Student s3 = new Student();
		s3.num = 3;
		s3.name = "나미";
		
		//student 변수를 비교하는 메서드
		System.out.println(s2 == s3); // false(내용(속성)은 같지만, 주소가 다르기 때문에)
		System.out.println(s2.equals(s3)); // false
		System.out.println(m2.m24c(s2, s3)); // true - s1,s2자리에 s2 s3를 넣은거임
		System.out.println(m2.m24c(s2, s)); // false
		
		
		//s변수 디버깅 < 로깅
		//반환타입 String
		//매개타입 Student
//		System.out.println(s.num + "," + s.name);
//		System.out.println(m2.m25a(s));
//		System.out.println(s2.num + "," + s2.name);
//
//		int[] arr = new int[7];
//		System.out.println(m2.m24a(arr)); // 7
//		System.out.println(m2.m24b(arr)); // 7
//		m2.m24b(arr);
	}
}
