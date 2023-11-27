import java.util.Random;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		int rand = random.nextInt(10); // 0부터 9까지
		
		
		int rand1 = random.nextInt(10) + 1; // 1부터 10까지
		
		int rand2 = random.nextInt(10) - 10; // -10부터 -1까지
		
		random.nextBoolean();
		
	}

}
