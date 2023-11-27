import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// DBMS > jdbc:mysql:
		// MySQL 서버 주소 >  //localhost:3306
		// 어떤 database 사용할 거니  > /examplesdb
		String url = "jdbc:mysql://localhost:3306/classicmodels";
		String id = "test";
		String pw = "test1234";
		
		// cpnection 객체 만들자
		try
		{
			// MySQL Driver 생성
			Class.forName("com.mysql.jdbc.Driver");
			// Connection 생성
			Connection conn = DriverManager.getConnection(url, id, pw);
			System.out.println("MySQL에 접속 성공 ! ");
			
			// MySQL 에 전달할 SQL명령어 정의
			String sql = "show tables;";
			// connection 객체에 sql 명령어 전달
			PreparedStatement pstmt= conn.prepareStatement(sql); 
			
			// sql 명렁어를 mysql 전달 및 응답을 리턴받음 : 중복되지 않음
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				String table_name = rs.getString("Tables_in_classicmodels");
				System.out.println("테이블 이름은" + table_name);
			}
			
		}catch ( ClassNotFoundException e)
		{
			System.out.println("mysql.jdbc.Driver를 생성하다가 오류발생 ");
			e.printStackTrace();
		}catch (SQLException e)
		{
			System.out.println("Connection 생성하다가 오류발생");
			e.printStackTrace();
		}

	}

}
