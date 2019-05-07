package design_pattern.singleton;

public class D_ThreadSafeLazyInit {
	
	private static D_ThreadSafeLazyInit instance;
	
	private D_ThreadSafeLazyInit() {}
	
	
	// the issue in case of multi-threaded application
	// multiple thread can be inside if condition at same time 
	// and multiple thread will get different instance of the singleton class
	// this is how you can break singleton
	public synchronized static D_ThreadSafeLazyInit getInstance() {
		
		if(instance == null) {
			instance = new D_ThreadSafeLazyInit();
		}
		
		return instance;
	}

}
