package design_pattern.singleton;

public class C_LazyInitialization {
	
	private static C_LazyInitialization instance;
	
	private C_LazyInitialization() {}
	
	
	// the issue in case of multi-threaded application
	// multiple thread can be inside if condition at same time 
	// and multiple thread will get different instance of the singleton class
	// this is how you can break singleton
	public static C_LazyInitialization getInstance() {
		
		if(instance == null) {
			instance = new C_LazyInitialization();
		}
		
		return instance;
	}

}
