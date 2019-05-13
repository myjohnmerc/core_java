package design_pattern.factory;

public class FactoryDemo {

	public static void main(String[] args) throws Exception {
		CarFactory.buildCar(CarType.SEDAN).run();
	}
}
