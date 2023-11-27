import java.util.ArrayList;
import java.util.List;

public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  반성적표 확인
		 *  data : 100, 80, 50 ,90 ,70
		 *  평균 ?
		 *  가장 큰 수 는 ?
		 *  가장 작은 수는 ?
		 */
		
		List<Integer> lst = new ArrayList<>();
		
		lst.add(100);
		lst.add(80);
		lst.add(50);
		lst.add(90);
		
		
		lst.add(70);
		
		int sum = 0;
		int max =  lst.get(0);
		int min = lst.get(0);
		for (int i = 0; i<lst.size(); i++)
		{
			sum += lst.get(i);
			if (max < lst.get(i))
			{
				max = lst.get(i);
			}
			if (min > lst.get(i))
			{
				min = lst.get(i);
			}
		}
		double avg = sum / lst.size();
		System.out.println("평균 : " + avg);
		System.out.println("가장큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
	}

}
