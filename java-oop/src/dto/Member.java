package dto;

public class Member {
	//정보은닉
	private String id;
	private int age;
	private String pw;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0) {
			age=0;
		}
		this.age=age;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	//캡슐화
//	//셋터
//	public void setId(String id) {
//		this.id = id;
//	}
//	
//	//겟터
//	public String getId() {
//		return this.id;
//	}
	
	
}