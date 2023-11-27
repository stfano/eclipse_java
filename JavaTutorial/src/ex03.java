
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수형 int < long :  더 넓은 범위의 숫자를 표현
		int x = 30;
		long y = 50L;
		System.out.println(x); // sysout + ctrl + space
		System.out.println(y);
		System.err.println("=======================");
		
		long y1 = x; // int는 long보다 작기 때문에 형변환 가능
		int x1 = (int)y; // long은 int보다 크기때문에 형변환 불가능
		System.out.println(x1); // sysout + ctrl + space
		System.out.println(y1);
	}
}
