import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> lst = Arrays.asList(10,10,10,10,10);
		
		
		for( int i =0; i < lst.size(); i++)
		{
			lst.set(i, lst.get(i) * (i+1));
		}
		
		System.out.println(lst);
	}

}
