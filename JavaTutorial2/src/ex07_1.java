import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ex07_1
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		 * 데이터: 20,40,70,70,80,70,100
		 * 최빈값?
		 * 정렬?? 20,40,70,70,70,80,100 이렇게 작은 순서대로 정렬된.. list
		 */
		
		// 최빈값???
		// 가장 빈도수가 높은 데이터???
		// 첫번째 데이터별 빈도수를 구하자!!!
		// 빈도수를 비교하여 가능 큰 수를 찾아보자!!!
		
		
		List<Integer> lst = Arrays.asList(20,40,70,70,80,70,100);
		// 첫번째 데이터별 빈도수를 구하자!!!
		// 키:데이터 & 벨류: 빈도수....
		Map<Integer, Integer> map = new HashMap<>();
		for(int data : lst) {
			// 만약에 데이터 값이 존재한다면, 
			if(map.containsKey(data)) {
				int cnt = map.get(data);
				cnt += 1;
				map.put(data, cnt);
			}
			// 만약 데이터 가 존재하지 않으면, 1(빈도수)
			else {
				map.put(data, 1);
			}
		}
		System.out.println(map);
		
		for(int i:map.keySet()) {
			System.out.println(i+"키의 값은 "+map.get(i));
		}
		
		// 빈도수를 비교하여 가능 큰 수를 찾아보자!!!
		int data_max = lst.get(0); 
		System.out.println("================================");
		for(int data:map.keySet()) {
			System.out.println("새로운 for문이 시작되었습니다.!!!!");
			System.out.println("data: "+data);			
			System.out.println("map.get(data_max): "+map.get(data_max));
			System.out.println("map.get(data): "+map.get(data));
			if(map.get(data_max) < map.get(data)) {
				System.out.println("data_max가 수정되었어요!!!!");
				data_max = data;
			}
			
			System.out.println("data_max: "+data_max);
		}
		System.out.println("================================");
		
		System.out.println("최빈값은 "+data_max);
	}

}