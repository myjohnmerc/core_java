package design_pattern.builder;

public class BuilderDemo {
	public static void main(String[] args) {
		
		// only 1 param is changed, rest are defaults
		Car car = new Car.Builder().withColor("Yellow").build();
		System.out.println(car);
		
		
		// with all custom params
		Car car2 = new Car.Builder().withModel("Sports").withColor("Red").forTank(30).withEngine("V8").build();
		System.out.println(car2);
	}
}
