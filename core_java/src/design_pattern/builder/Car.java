package design_pattern.builder;

public class Car {

	private String model;
	private String engine;
	private int tankCapacity;
	private String color;
	
	private Car() {}
	

	@Override
	public String toString() {
		return "Car [model=" + model + ", engine=" + engine + ", tankCapacity=" + tankCapacity + ", color=" + color
				+ "]";
	}


	public static class Builder {
		private String model = "Sedan";
		private String engine = "v4";
		private int tankCapacity = 30;
		private String color = "Black";
		
		public Builder withModel(String model) {
			this.model = model;
			return this;
		}
		
		public Builder withEngine(String engine) {
			this.engine = engine;
			return this;
		}
		
		public Builder forTank(int tankCapacity) {
			this.tankCapacity = tankCapacity;
			return this;
		}
		
		public Builder withColor(String color) {
			this.color = color;
			return this;
		}
		
		public Car build() {
			Car car = new Car();
			car.model = this.model;
			car.engine = this.engine;
			car.tankCapacity = this.tankCapacity;
			car.color = this.color;
			
			return car;
		}
		
	}
	
	
	
}
