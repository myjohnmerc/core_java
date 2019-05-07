package design_pattern.singleton;

public class A_EagerInitialization {
	
	private static A_EagerInitialization instance = new A_EagerInitialization();
	
	private A_EagerInitialization() {}
	
	
	public static A_EagerInitialization getInstance() {
		return instance;
	}

}
