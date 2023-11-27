
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JdbcUtil {
	private static String url = "jdbc:mysql://localhost:3306/exeamplesdb";
	private static String id = "urstory";
	private static String pw = "u1234";

	private static Connection conn;
	private static JdbcUtil instance = new JdbcUtil();
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// connection 생성 
			conn = DriverManager
					.getConnection(url, id, pw);
			System.out.println("MySQL에 접속 성공!!");
			
		} catch(Exception e) {
			System.out.println("MySQL 접속 오류");
			System.out.println(e);
		}
	}
	
	public static JdbcUtil getInstance() {
		return instance;
	}
	
	private void closeAll(
			Connection conn
			, PreparedStatement pstmt
			, ResultSet rs) {
		
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public int insertOrUpdate(String sql) {
		int result = -1;
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeUpdate();
			//this.conn.commit();
			
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			this.closeAll(conn, pstmt, rs);
			
		}
		
		return result;
	}

	public List<Map> selectBySql(String sql) {
		List<Map> lst = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCnt = rsmd.getColumnCount();
			while(rs.next()) {
				
				Map<String, Object> map = new HashMap<>();
				
				for(int i=1;i<=columnCnt;i++) {
					String colNm = rsmd.getColumnName(i);
					map.put(colNm
							, rs.getObject(colNm));
				}
				
				lst.add(map);
			}
			
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			this.closeAll(conn, pstmt, rs);
			
		}
		
		return lst;
	}
}