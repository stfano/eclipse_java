import java.util.List;
import java.util.Map;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JdbcUtil ju = JdbcUtil.getInstance();
		
		/*
		String sql1 = """
				update mytable
				set modelnumber = '22222', series = '222'
				where id = 1;
				""";
		
		ju.insertOrUpdate(sql1);
		*/
		
		String sql2 = """
				select * from mytable;
				""";
		List<Map> result = ju.selectBySql(sql2);
		System.out.println(result.toString());
	}

}
