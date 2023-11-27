import java.sql.*;

public class ex01 {

	public static void main(String[] args) {
		
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		try 
		{
			JdbcUtil ju = new JdbcUtil();
			conn = ju.getConnection();
			
			String sql = "show tables;";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next())
			{
				String table_name = rs.getString("Talbes_in_classicmodels");
				System.out.println(table_name);
			}
			
			
		} catch (Exception e)
		{
			System.out.println(e);
		} finally 
		{
			if (rs != null )
			{
				try 
				{
					rs.close();
				} catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			
			if (pstmt != null )
			{
				try 
				{
					pstmt.close();
				} catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
			
			if ( conn != null )
			{
				try 
				{
					conn.close();
				} catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}

}
