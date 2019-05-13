package design_pattern.factory;

public abstract class Car {
	
	private CarType carType;
	
	
	public Car(CarType carType) {
		super();
		this.carType = carType;
	}

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}
	
	
	public abstract void run();
	
	

}
