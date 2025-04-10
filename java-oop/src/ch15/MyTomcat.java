package ch15;

public class MyTomcat 

{
	public void service(Jsp jsp) { // jsp객체 a.jsp / b.jsp 
		jsp.post(); // jps->html
	}
	
	public static void main(String[] args) {
		MyTomcat t = new MyTomcat();
		t.service(new Ajsp());
		t.service(new LoginAction());
	}
}
