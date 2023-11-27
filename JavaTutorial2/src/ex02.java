import java.util.HashSet;
import java.util.Set;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  python 에서 set  집합을 표현하는 자료형
		 *  java 에서 set 역시 집합을 표현한다.
		 *  
		 *  집합의 기능 ?
		 *  - 중복 데이터 제거
		 *  - 각 집합의 합 또는 차 집합 연산 진행 
		 */
		
		Set<String> set = new HashSet<>();
		set.add("H");
		set.add("H");
		set.add("H");
		set.add("T");
		set.add("T");
		set.add("H");
		
		// 중복이 허용되면 6개 제거 되면 2개
		System.out.println(set.size());

		
	}

}
