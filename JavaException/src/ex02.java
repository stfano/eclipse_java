
public class ex02 {
	
	private static void isError1() throws MyException 
	{
		throw new MyException();
	}
	
	private static void isError2() throws Exception 
	{
		throw new Exception("부모 오류");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
