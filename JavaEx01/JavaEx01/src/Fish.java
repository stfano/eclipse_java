
public class Fish implements Animal {

	private int speed;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public Fish() {
		this.speed = 10;
	}
	public Fish(int speed) {
		this.speed = speed;
	}
	
	public void swim() {
		System.out.println(this.speed+" 속도만큼 빠르게 헤엄치다.");
	}
	
	@Override
	public String eat(String food) {
		// TODO Auto-generated method stub
		System.out.println(food+"를 맞있게 먹는다.");
		return "배가 부르다";
	}

	@Override
	public void see(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg+"를 유심히 본다.");
	}

}
