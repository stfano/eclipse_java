import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			String sql = """
					select 
						t2.orderNumber as order_num
					  , max(t2.orderLineNumber) as order_max
					from orders t1, orderdetails t2
					where 1=1
					  and t1.status = 'Shipped'
					  and t1.orderNumber = t2.orderNumber
					group by order_num # orderNumber를 기준으로 통계값을 뽑자!!
					limit 5
					;
					""";
			// connection 객체에 sql 명령어 전달!!
			PreparedStatement pstmt = conn
					.prepareStatement(sql);
			
			// sql 명령어를 mysql 전달 및 응답을 리턴 받음!!
			ResultSet rs = pstmt.executeQuery();
			
			
			List<Map> lst = new ArrayList<>();
			while(rs.next()) {
				
				Map<String, Integer> map = new HashMap<>();
				map.put("order_num", rs.getInt("order_num"));
				map.put("order_max", rs.getInt("order_max"));
				
				lst.add(map);
			}
			
			System.out.println("프린트 시작!!");
			for(Map map:lst) {
				System.out.println(map.get("order_num"));
				System.out.println(map.get("order_max"));
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
