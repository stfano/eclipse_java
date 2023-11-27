import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jdbcUtil jdbc = new jdbcUtil();
		Connection conn = jdbc.getConn();
		
		try {
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
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}
