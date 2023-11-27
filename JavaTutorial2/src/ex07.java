import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class ex07 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		/*
		 *  data : 20,40, 70 ,70 ,80 ,70, 100
		 *  1. 최빈값
		 *  3. 정렬 오름차순
		 */
		
		List<Integer> lst = new ArrayList<>();
		
		List<Integer> cnt_lst = new ArrayList<>();
		
		lst.add(20);
		lst.add(40);
		lst.add(70);
		lst.add(70);
		lst.add(70);
		lst.add(80);
		lst.add(70);
		lst.add(100);
		
		System.out.println(lst);
		
		for (int i = 0; i < lst.size(); i++)
		{
			int cnt = 0;
			for (int j = 0; j < lst.size(); j++) // 데이터 하나에 대한 모든 길이를 반복 하여 빈도수를 구함
														
			{
				if (lst.get(i) == lst.get(j)) // 데이터가 같다면 빈도수에 1 더함
				{
					cnt++;
				}
			}
			cnt_lst.add(cnt);	 // 데이터 하나에 대한 모든 데이터를 비교하여 반복문 하나가 종료되면
									// 리스트에 추가 
		}
		System.out.println(cnt_lst); // 각 데이터별 빈도수 답은 리스트 
		
		int val_max = 0;
		
		for (int i : cnt_lst) 
		{
			val_max =  Math.max(val_max,  i);
		}
		System.out.println(val_max); // 빈도수 리스트 에서 제일 큰 값 찾기 
		
		int mode_value = lst.get(val_max); 
		System.out.println(mode_value); // 최종결과

	}	
}
	
	
























