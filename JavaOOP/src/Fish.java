
public class Fish implements Animal{
	private String name;

	@Override
	public void baby()
	{
		System.out.println(name + "가 알을 낳습니다.");
	}
	
	@Override
	public void eating()
	{
		System.out.println(name + "가 음식을 먹습니다.");
	}
	
	@Override
	public void see()
	{
		System.out.println(name + "가 째려봅니다.");
	}
	
	public void swimming()
	{
		System.out.println(name + "가 헤어칩니다 ~");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

