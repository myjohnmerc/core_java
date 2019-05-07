package design_pattern.singleton.threads;

import design_pattern.singleton.D_ThreadSafeLazyInit;

public class SingletonGrabber implements Runnable {

	private D_ThreadSafeLazyInit instance;
	
	@Override
	public void run() {
		
		instance = D_ThreadSafeLazyInit.getInstance();
		System.out.println(Thread.currentThread().getName() + " : instance hash = " + instance.hashCode());
		
	}

}
