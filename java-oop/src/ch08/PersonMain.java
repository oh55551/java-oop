package ch08;
import java.util.*;
import java.util.Calendar;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		//1-1
		p1.m11();			//Person에 m11이 객체생성이 필요하니까
		p1.m11a();
		
		//1-2
		p1.m12(9); //am
		Calendar cal = Calendar.getInstance();
		int h = cal.get(Calendar.HOUR);
		p1.m12(h); //am
		p1.m12a(false); //flag = false (그 이후에 flag=true되고 출력돼서 true)
		//매개변수로 값이 전달
		boolean x = false;
		p1.m12a(x); //flag = false(그 이후에 flag=true되고 출력돼서 true)
		System.out.println(x);//메서드 밖에서의 일이라 그대로 false
		
		//1-3
		p1.m13a(null);
		p1.m13a("홍길동"); //홀수
		String  name = "심사임당";
		p1.m13a(name); //짝수
		Person p1a = new Person("admin", "1234");
		//p1a.id: admin / p1a.pw : 1234
		p1a.m13b("guest", "0000"); // 로그인실패
		
		//1-4
		int[] arr = new int[5]; // 0, 0, 0, 0, 0
		p1a.m14a(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println("");
		
		//1-5
		Data d = new Data(7, 7);
		p1a.m15a(d);
		System.out.println(d.x);
		System.out.println(d.y);
		
		//1-6
		Data[] datas = new Data[4];
		datas[0] = new Data(13,100);
		datas[1] = new Data(23,200);
		datas[2] = new Data(20,300);
		datas[3] = new Data(33,400);
		p1a.m16a(datas);
		p1a.m16b(datas, 200);
		
		//1-7
		String[] names = new String[2];
		names[0] = "루피";
		names[1] = "조로";
		p1.m15a(names);
		
		//1-8
		ArrayList<Integer> year = new ArrayList<Integer>();
		int y = 2000;
		for(int i=0; i<=50; i++) { 
			year.add(y);
			y=y+1;
		}
		p1.m18a(year);
		
		//1-9
		HashMap<String, Object> paramMap= new HashMap<String, Object>();
		paramMap.put("name","샹크스");
		paramMap.put("age",40);
		String[] myHobby = {"술", "견문색", "검도"};
		paramMap.put("hobby", myHobby);
		Data myData = new Data(7, 11);
		paramMap.put("data", myData);
		
		p1.m19a(paramMap);
	}
}
