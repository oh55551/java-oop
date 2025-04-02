package ch10;
import java.sql.*;
import java.util.*;

import dto.Actor;

public class ActorDAO {
	// Actor 테이블 데이터를 조회 - select 
	public ArrayList<Actor> selectActorList(int num) throws ClassNotFoundException, SQLException{
		ArrayList<Actor> list = new ArrayList<Actor>();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select actor_id, first_name, last_name, last_update from actor order by actor_id desc limit ?";
		stmt = conn.prepareStatement(sql);
		stmt.setInt(1, num);
		rs = stmt.executeQuery();
		
		//RestSet(특수한:외부api)->ArrayList(일반적:기본API,문법)
		while(rs.next()) {
			Actor a = new Actor();
			a.setActorId(rs.getInt("actorId"));
			a.setFirstName(rs.getString("firstName"));
			a.setLastName(rs.getString("lastName"));
			a.setLastUpdate(rs.getString("lastUpdate"));
			list.add(a);
		}
		
		conn.close();
		return list;
	}
	
	// Actor 테이블 데이터를 입력 - insert
	public int insertActor(Actor actor) throws ClassNotFoundException, SQLException {
		int row = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = null;
		PreparedStatement stmt = null;
		String sql = "insert into actor(first_name, last_name) values (?, ?)";
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","java1234");
		//쿼리 실행
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, actor.getFirstName());
		stmt.setString(2, actor.getLastName());
		System.out.println(stmt);
		row = stmt.executeUpdate();
		return row;
	}
	

}
