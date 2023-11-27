import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
		
		Set<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8));
		
		
		// 교집합 > inner join 
		System.out.println("교집합 전 : " + s1);		
		
		s1.retainAll(s2);
		
		System.out.println("교집합 후 : " + s1);
		
		// 합집합 > outer join
		Set<Integer> s3 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
		
		Set<Integer> s4 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));
		
		System.out.println("합집합 전 : " + s3);		
		
		s3.addAll(s4); // 애초에 집합끼리 합집합이여서 중복은 제거된다.
		
		System.out.println("합집합 후 : " + s3);
		
		// 차집합 > left or right join
		Set<Integer> s5 = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
		
		Set<Integer> s6 = new HashSet<>(Arrays.asList(4,5,6,7,8,9,10));
		
		System.out.println("차집합 전 : " + s5);		
		
		s5.removeAll(s6); // 애초에 집합끼리 합집합이여서 중복은 제거된다.
		
		System.out.println("차집합 후 : " + s5);
		
	}

}
