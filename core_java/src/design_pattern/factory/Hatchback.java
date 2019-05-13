package design_pattern.factory;

public class Hatchback extends Car {

	public Hatchback(CarType carType) {
		super(carType);
	}

	@Override
	public void run() {
		System.out.println("Hatchback is running");
		
	}

}
