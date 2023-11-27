import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DBSM -> jdbc:mysql:
		// MySQL 서버 주소 -> //localhost:3306
		// 어떤 Database 사용하는 거니? -> /examplesdb
		String url = "jdbc:mysql://localhost:3306/classicmodels";
		String id = "test";
		String pw = "test1234";
		
		try {
			// mysql driver 생성 
			Class.forName("com.mysql.jdbc.Driver");
			// connection 생성 
			Connection conn = DriverManager
					.getConnection(url, id, pw);
			System.out.println("MySQL에 접속 성공!!");
			
			// mysql에 전달할 sql 명령어 정의!!
			String sql = "show tables;";
			// connection 객체에 sql 명령어 전달!!
			PreparedStatement pstmt = conn
					.prepareStatement(sql);
			
			// sql 명령어를 mysql 전달 및 응답을 리턴 받음!!
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				String table_name = rs
						.getString("Tables_in_classicmodels");
				System.out.println("테이블 이름은 "+table_name);
			}
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("mysql.jdbc.Driver를 생성하다가 오류 발생!!");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection 생성하다가 오류 발생!!");
			e.printStackTrace();
		}
	}

}
