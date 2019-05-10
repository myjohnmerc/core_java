package design_pattern.singleton.threads;

import design_pattern.singleton.B_EagerInitiWithStaticBlock;

public class SingletonGrabber implements Runnable {

	private B_EagerInitiWithStaticBlock instance;
	
	@Override
	public void run() {
		
		instance = B_EagerInitiWithStaticBlock.getInstance();
		System.out.println(Thread.currentThread().getName() + " : instance hash = " + instance.hashCode());
		
	}

}
