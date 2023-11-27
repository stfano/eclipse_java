
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car("BENZ 지바겐", "black", 4);
		
		System.out.println(car.getCompany());
		System.out.println(car.getColor());
		System.out.println(car.getWheels());
		
		System.out.println("색상을 수정하겠습니다.");
		car.setColor("blue");
		System.out.println(car.getColor());
	}

}
