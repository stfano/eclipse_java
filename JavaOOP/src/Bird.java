
public class Bird implements Animal{
	
	private String name ;


	@Override
	public void baby() {
		System.out.println( " 알을 낳는다.");
		
	}

	@Override
	public void eating() {
		System.out.println( " 음식을 먹는다.");
		
	}

	@Override
	public void see() {
		System.out.println( " 본다");
		
	}
	
	public void fly() {
		System.out.println( "날다.");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
