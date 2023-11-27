
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] scores = {
				10, 20, 30, 40, 50
		}; // 데이터형이 int형으로 동일해야함 하나라도 다를시 에러
		
		System.out.println(scores.length);
		System.out.println(scores[0]);
		
		// 평군
		int sum = scores[0] + scores[1] + scores[2] + scores[3] +scores[4];
		// for 문
		int sum1 = 0;
		for (int i=0; i < scores.length; i++)
		{
			sum1 += scores[i];
		}
		double avg = sum / scores.length;
		double avg1 = sum1 / scores.length;
		
		System.out.println(avg);
		System.out.println(avg1);
	}

}
