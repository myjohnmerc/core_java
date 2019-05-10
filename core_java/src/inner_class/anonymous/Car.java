package inner_class.anonymous;

public class Car {

	
	// Anonymous inner class
	Engine engine = new Engine() {
		@Override
		public void showSpecs() {
			System.out.println("Engine: V8");
		}
	};

	public void showSpecs() {
		System.out.println("Car: Model = SV");
		engine.showSpecs();
		new Engine() {
			@Override
			public void run() {
				System.out.println("Car is Running");
			}
		}.run();
		
	}

}
