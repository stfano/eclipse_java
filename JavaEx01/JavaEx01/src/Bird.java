
public class Bird implements Animal {

	@Override
	public String eat(String food) {
		// TODO Auto-generated method stub
		System.out.println(food+"를 공중에서 먹는다.");
		return "배가 부르다";
	}

	@Override
	public void see(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg+"를 먼곳에서 본다.");
	}

}
