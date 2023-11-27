import java.util.ArrayList;
import java.util.List;

public class exx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst = new ArrayList<>();
		List<Integer> lst1 = new ArrayList<>();
		
		// 1. lst에 10,10,10,10,10 
		// 2. for 문을 통해서 10, 20, 30, 40, 50으로 데이터를 변경 
		
		lst.add(10);
		lst.add(10);
		lst.add(10);
		lst.add(10);
		lst.add(10);
		
		for (int i = 0; i < lst.size(); i++)
		{
				lst.set(i, (i+1)*10);
			
		}
		System.out.println(lst);
		
		// 강사님 정답
		for (int i = 0; i<5; i++)
		{
			lst1.add(10);
		}
		for (int i = 0; i<lst1.size(); i++)
		{
			int val = lst1.get(i);
			val = val * (i + 1);
			lst1.set(i, val);
		}
		for (int i = 0; i<lst1.size(); i++)
		{
			System.out.println(lst1.get(i));
		}
	}

}
