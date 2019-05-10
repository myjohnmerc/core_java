package design_pattern.singleton;

import java.io.Serializable;

public class D_ThreadSafeLazyInit  implements Serializable {
	
	private static D_ThreadSafeLazyInit instance;
	
	private D_ThreadSafeLazyInit() {
		
		if(instance!=null)
			throw new IllegalStateException("Singleton already instiatated");
		
	}
	
	
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
