package design_pattern.factory;

public class CarFactory {

	public static Car buildCar(CarType carType) throws Exception {
		
		switch(carType) {
		case SEDAN:
			return new SedanCar(carType);
		case HATCHBACK:
			return new Hatchback(carType);
		default:
			throw new Exception("Unsupported Car Type");
			
		}
	}
	
}
