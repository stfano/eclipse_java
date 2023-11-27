
public class Peacock extends Bird {
	public int charm_score; // 매력점수.

	@Override
	public String eat(String food) {
		// TODO Auto-generated method stub
		if (charm_score > 10) {
			System.out.println("아름답게 먹는다.");
		}
		else {
			System.out.println("허겁지겁 먹는다.");
		}
		return String.valueOf(this.charm_score);
	}

	@Override
	public void see(String msg) {
		// TODO Auto-generated method stub
		if (charm_score > 10) {
			System.out.println("아주 멀리 본다.");
		}
		else {
			System.out.println("그냥 본다.");
		}
	}
	
	
}
