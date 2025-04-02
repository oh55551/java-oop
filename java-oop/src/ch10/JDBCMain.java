package ch10;
import java.sql.*;
import java.util.*;
import dto.Actor;

public class JDBCMain {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 라이브러리를 추가 (project우클릭-build path항목에서 추가)
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection conn = null;
//		PreparedStatement stmt = null;
//		int row=0;
//		String sql = "insert into actor(first_name, last_name) values (?, ?)";
//		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","java1234");
		
		//1)키보드를 통해 매개값 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.println("firstName을 입력하세요.:");
		String firstName = scanner.nextLine();
		System.out.println("lastName을 입력하세요.:");
		String lastName = scanner.nextLine();
		System.out.println("firstName: "+firstName);
		System.out.println("lastName: "+lastName);
		scanner.close();
		
		//2)
		Actor actor = new Actor();
		actor.setFirstName(firstName);
		actor.setLastName(lastName);
		
		//3)
		ActorDAO actorDao = new ActorDAO();
		int row = actorDao.insertActor(actor);
		
		
		//4)조회
		ArrayList<Actor> list = actorDao.selectActorList(5);
		
		//5)출력
		for(Actor a : list) {
			System.out.println(a.getActorId()+a.getFirstName()+a.getLastName()+a.getLastUpdate());
		}
		
//		//조회 select 
//		PreparedStatement stmt2 =null;
//		ResultSet rs2 = null;
//		String sql2 = "select actor_id, first_name, last_name, last_update from actor order by actor_id desc limit 5";
//		stmt2 = conn.prepareStatement(sql2);
//		rs2=stmt2.executeQuery();
//		System.out.println("actorId\tfirstName\tlastName\tlastUpdate");
//		while(rs2.next()) {
//			System.out.println(rs2.getInt("actor_id")+"\t"+rs2.getString("first_name")+"\t"+rs2.getString("last_name")+"\t"+rs2.getString("last_update")+"\t");
//		}
//		
//		conn.close();
		
//		try {
//			int x = 10 / 0;
//		}catch(ArithmeticException e) {
//			System.out.println("0으로 나누면 안됩니다.");
//		}
	}
}
