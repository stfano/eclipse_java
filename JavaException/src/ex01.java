
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =0 , b = 0, c = 0;
		
		System.out.println("try문 시작 전입니다. ");
		
		try 
		{
			System.out.println("try문 시작했습니다. ");
			a = 10;
			b = 2;
			c = a / b;
			System.out.println("try문 끝났습니다. ");
		} catch (ArithmeticException e)
		{
			System.out.println("catch문 시작했습니다. ");
			System.out.println(e.getMessage() );
			
			c = -1;
			System.out.println("catch문 끝났습니다. ");
		} finally
		{
			System.out.println(a + b + c);
		}

	}

}
