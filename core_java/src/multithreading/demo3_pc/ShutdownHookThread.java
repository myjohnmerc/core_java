package multithreading.demo3_pc;

public class ShutdownHookThread implements Runnable {

	@Override
	public void run() {
		System.out.println("%%% Shutting down JVM %%%");

	}

}
