package dto;

public class Actor {
	private Integer actorId;
	private String firstName;
	private String lastName;
	private String lastUpdate;
	
	//캡슐화 (우클릭- source -세터게터만들기) (우클릭 - source- 생성자 using fields 를 체크다풀고하나 체크다해서하나)
	public Actor() {
	}
	public Actor(Integer actorId, String firstName, String lastName, String lastUpdate) {
		super();
		this.actorId = actorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastUpdate = lastUpdate;
	}
	public Integer getActorId() {
		return actorId;
	}
	public void setActorId(Integer actorId) {
		this.actorId = actorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	
}
