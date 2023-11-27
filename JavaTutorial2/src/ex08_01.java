import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex08_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 문제:
		 * 데이터: 10,20,30,40,50,60,70
		 * 2의 배수인 경우 데이터에 곱하기 2 
		 * 3의 배수인 경우 데이터에 곱하기 3
		 * 정답: 10,40,90,80,50,180,70
		 */
		int[] arr = {1,2,3,4,5,7,8,9};
		for(int i=0;i<arr.length;i++) {
			// 2의 배수인 경우 데이터에 곱하기 2
			if(arr[i]%2 == 0) {
				arr[i] = arr[i] *2;
			} 
			// 3의 배수인 경우 데이터에 곱하기 3
			else if(arr[i]%3 == 0) {
				arr[i] = arr[i] *3;
			}
			// 그 외!!!
			continue;
		}
		
		List<Integer> list = Arrays.stream(arr)
				.boxed()
				.collect(Collectors.toList());
		System.out.println(list);
	}
}