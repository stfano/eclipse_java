import java.util.Map;
import java.util.HashMap;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		
		map.put("name", "Abigail");
		map.put("age", "11");
		map.put("address", "Seoul");
		
		// map 수정
		map.replace("age", "30");
		
		// python > len(map.keys())
		// map의 data 수
		System.out.println(map.size());
		
		// python > map.keys()
		System.out.println(map.keySet());
		
		// map에 저장된 데이터 확인 !
		System.out.println(map.get("name"));
	
		// map의 data 제거
		map.remove("name");
		System.out.println(map.keySet());
		
		// python > for key in map.keys()
		for (String key : map.keySet()) 
		{
			System.out.println(key + "의 value 값은 " + map.get(key));
		}
		
		// aaa라는 키값이 map에 존재하는지 유무를 확인하는 함수 !
		System.out.println(map.containsKey("aaa"));
		
		// 30이라는 value 값이 map에 존재하는지 유무를 확인하는 함수 !
		System.out.println(map.containsValue("30"));
	}
}
