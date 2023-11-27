
public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Math.max(30, 50));
		
		int [] arr = {10,20,30,40,50};
		int val_max = 0;
		
		for (int i : arr) 
		{
			val_max =  Math.max(val_max,  i);
		}
		
		
	}

}
