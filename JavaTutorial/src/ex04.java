
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 실수형 double > float
		
		double x = 30.5;
		float y = 30.0f;
		
		System.out.println(x);
		System.out.println(y);
		
		double x1 = y;
		float y1 = (float)x; // double이 float보다 크므로 데이터 형변환 불가능
		
		System.out.println(x1);
		System.out.println(y1);
	}

}
