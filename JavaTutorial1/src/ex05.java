import java.util.ArrayList;  // ArratList 선언 시
import java.util.List;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<String> lst1 = new ArrayList<>();
		
		List<String> lst1 = new ArrayList<>();
		
		System.out.println("삽입 전 lst1의 길이는 : " + lst1.size());
		
		// 삽입
		lst1.add("1");
		lst1.add("1");
		lst1.add("1");
		lst1.add("1");
		
		lst1.set(1, "10"); // 1번째 인덱스 수정
		
		lst1.remove(0); // 0번째 인덱스 삭제
		
		System.out.println("삽입 후 lst1의 길이는 : " + lst1.size());
		
		for (int i = 0; i < lst1.size(); i++)
		{
			// list 의 데이터를 조회하러면, get() 함수 사용 
			System.out.println(lst1.get(i));
		}
	}

}











