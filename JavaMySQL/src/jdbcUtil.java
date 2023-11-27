import java.sql.*;

public class jdbcUtil {
	private  String url = "jdbc:mysql://localhost:3306/classicmodels";
	private  String id = "test";
	private  String pw = "test1234";
	
	private static Connection conn;
	
	public jdbcUtil ()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			// Connection 생성
			this.conn = DriverManager.getConnection(this.url, this.id, this.pw);
			System.out.println("MySQL에 접속 성공 ! ");
			
		}catch (Exception e)
		{
			System.out.println("MySQL 접속 오류");
			System.out.println(e);
		}
	}
	
	public Connection getConn()
	{
		return this.conn;
	}
}
