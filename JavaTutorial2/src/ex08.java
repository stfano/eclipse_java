import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  data : 10,20,30,40,50,60,70
		 *  2의 배수인 경우 data에 2곱하기
		 *  3의 배수인 경우에 data에 3 곱하기
		 */
		
		List<Integer> data = Arrays.asList(1,2,3,4,5,7,8,9);
		

		
		for (int i = 0; i < data.size(); i++)
		{
			if (data.get(i) % 2 == 0  && data.get(i) % 3 == 0 )
			{
				data.set(i, data.get(i)*2*3);
			}
			else if  (data.get(i) % 2 == 0)
			{
				data.set(i, data.get(i)*2);
			}
			else if  (data.get(i) % 3 == 0)
			{
				data.set(i, data.get(i)*3);
			}
			else 
			{
				data.get(i);
			}
		
		}
		System.out.println(data);
	
	}

}
