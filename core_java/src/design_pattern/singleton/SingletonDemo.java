package design_pattern.singleton;

import design_pattern.singleton.threads.SingletonGrabber;

public class SingletonDemo {

	public static void main(String[] args) {
		
	//	B_EagerInitiWithStaticBlock instance = B_EagerInitiWithStaticBlock.getInstance();
		
		//System.out.println(Integer.toHexString(instance.hashCode()));
		
		new Thread(new SingletonGrabber(), "GR1").start();
		new Thread(new SingletonGrabber(), "GR2").start();
	}

}
