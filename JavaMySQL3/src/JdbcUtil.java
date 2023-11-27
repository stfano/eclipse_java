import java.sql.*;

public class JdbcUtil {

	
	public static String url = "jdbc:mysql://localhost:3306/examplesdb";
	public static String user = "urstory";
	public static String password = "u1234";

	// private static Connection conn;
	public static Connection conn = null ;
	
	
	private static JdbcUtil instance = new JdbcUtil();
	
	static // static 영역안에서는 고유한 값임 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			// connection 생성 
		    conn = DriverManager
					.getConnection(url, user, password);
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
