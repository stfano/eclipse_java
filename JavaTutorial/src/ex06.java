
public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// string 문자열
		String str = "자바 싫어 ..";
		
		System.out.println(str);
		
		// str >> int 
		str = "100";
		// String > int 
		int i = Integer.parseInt(str);
		System.out.println("int : " + i);
		
		//String > long
		long l = Long.parseLong(str);
		System.out.println("long : " + l );
		
		// String > double
		double d = Double.parseDouble(str);
		System.out.println("double : " + d);
		
		// int > String 
		String s1 = String.valueOf(i);
		String s2 = String.valueOf(d);
		System.out.println("int to : " + s1);
		System.out.println("double to : " + s2);
	}

}
