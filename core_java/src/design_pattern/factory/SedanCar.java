package design_pattern.factory;

public class SedanCar extends Car {

	public SedanCar(CarType carType) {
		super(carType);
		
	}

	@Override
	public void run() {
		System.out.println("Sedan is running");
		
	}

}
