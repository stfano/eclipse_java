
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] scores = {
				10, 20, 30, 40, 50
		};
		
		for (int i=0; i < scores.length; i++)
		{
			System.out.println(scores[i]);
		}
		
		int max = 0;
		for (int i =0; i < scores.length; i++)
		{
			if (max < scores[i])
			{
				max = scores[i];
			}
		}
		System.out.println(max);
	}

}
