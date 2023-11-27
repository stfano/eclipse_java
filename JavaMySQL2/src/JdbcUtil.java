import java.sql.*;

public class JdbcUtil {
	private static String url = "jdbc:mysql://localhost:3306/classicmodels";
	private static String id = "test";
	private static String pw = "test1234"; 
	
	private static Connection conn;
	
	private static JdbcUtil instance = new JdbcUtil();
	
	static // static 영역안에서는 고유한 값임 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			// connection 생성 
		    conn = DriverManager
					.getConnection(url, id, pw);
			System.out.println("MySQL에 접속 성공!!");
			
		} catch(Exception e) 
		{
			System.out.println("MySQL 접속 오류");
			System.out.println(e);
		}
	}
	
	public static JdbcUtil getInstance() // getter 
	{
		return instance;
	}
	
	public Connection getConnection () // getter
	{
		return conn;
	}
}
