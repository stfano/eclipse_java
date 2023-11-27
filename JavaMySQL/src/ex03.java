import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex03 {

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
			String sql = "select \r\n"
					+ "	t2.orderNumber as order_number, max(t2.orderLineNumber) as order_max\r\n"
					+ "from orders t1, orderdetails t2\r\n"
					+ "where 1=1\r\n"
					+ "  and t1.status = 'Shipped'\r\n"
					+ "  and t1.orderNumber = t2.orderNumber\r\n"
					+ "group by t2.orderNumber # orderNumber를 기준으로 통계값을 뽑자!!\r\n"
					+ "limit 5\r\n"
					+ ";\r\n"
					+ "";
			// connection 객체에 sql 명령어 전달
			PreparedStatement pstmt= conn.prepareStatement(sql); 
			
			// sql 명렁어를 mysql 전달 및 응답을 리턴받음 : 중복되지 않음
			ResultSet rs = pstmt.executeQuery();
			
			
			List <Integer> order_num = new ArrayList<>();
			List <Integer> order_maxx = new ArrayList<>();
			while(rs.next())
			{
				int order_numbers = rs.getInt("order_number");
				int order_maxs = rs.getInt("order_max");
			
				order_num.add(order_numbers);
				order_maxx.add(order_maxs);
			}
			
			System.out.println(order_num);
			System.out.println(order_maxx);

			
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