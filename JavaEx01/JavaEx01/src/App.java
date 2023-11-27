
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shark shark = new Shark(5);
		Timo timo = new Timo();
		
		System.out.println("상어의 속도는 "+shark.speed);
		System.out.println("티모의 속도는 "+timo.speed);
		
		String msg = shark.eat("오징어");
		System.out.println("식사 후 상어의 말은 "+msg);
		timo.hide();
	}

}
