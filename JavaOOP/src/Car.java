// 클래스 정의 
public class Car {
	// 속성 ( data )
	public String company;
	public String color;
	private int wheels;
	
	/*
	// get 함수를 만들자
	
	public String getCompany()
	{
		return this.company;
	}
	public String getColor()
	{
		return this.color;
	}
	public int getWheels()
	{
		return this.wheels;
	}
	
	
	// set 함수를 만들자
	
	public void setCompany(String new_company)
	{
		this.company = new_company;
	}
	public void setColor(String new_color)
	{
		this.color = new_color;
	}
	public void setWheels(int new_wheels)
	{
		this.wheels = new_wheels;
	}
	*/
	
	
	// 생성자 함수
	public Car() {}; // 기본 생성자, return 값 생성 x 
	public Car(String company, String color, int wheels)
	{
		this.company = company;
		this.color = color;
		this.wheels = wheels;
	}
	
	// 함수 ( 기능 )
	public void startEngine()
	{
		System.out.println("부릉 부릉 ");
	}
	public int moveForward(int num)
	{
		int move_num = num * 10;
		System.out.println("앞으로 " + move_num+ "만큼 이동");
		return move_num;
	}
	private void openWindow()
	{
		System.out.println("비밀 스킬을 습득 ");
	}
	
	// get set 함수
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
}
