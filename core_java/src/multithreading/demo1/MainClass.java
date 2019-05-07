package multithreading.demo1;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
//		NumberPrinter np1 = new NumberPrinter("NP1");
//		NumberPrinter np2 = new NumberPrinter("NP2");
//
//		BigNumberPrinter bnp = new BigNumberPrinter("BigNum");
//
//		Thread t1 = new Thread(np1, "NP1");
//
//		Thread t2 = new Thread(np2, "NP2");
//
//		Thread t3 = new Thread(bnp);
//
//		t3.setDaemon(false);
//
//		t1.setPriority(10);
//		t2.setPriority(10);
//		t3.setPriority(1);
//		t1.start();
//		// t1.yield();
//		// t1.join(500);
//		// t1.join();
//		// t2.start();
//		// t2.join(6000);
//		t3.start();
		// t1.join(500);
		/*
		 * for (int i = 0; i < 5; i++) { // Control passes to child thread //
		 * Thread.yield();
		 * 
		 * // After execution of child Thread // main thread takes over
		 * System.out.println(Thread.currentThread().getName() + " in control"); }
		 */
		System.out.println("Starting Thread");
		
		BigNumberPrinter bnp1 = new BigNumberPrinter("BNP_1");
		BigNumberPrinter bnp2 = new BigNumberPrinter("BNP_2");
		bnp1.start();
		bnp2.start();
		
		System.out.println("$$$$ Main Sleeping for 5 seconds");
		Thread.sleep(5000);
	
		
		
		System.out.println("$$$$ Main Woke up");
		
		
		while(bnp1.isAlive() || bnp2.isAlive()) {
			//System.out.println("inside main while");
		}
		
		
		System.out.println("---- Counter Total: " + BigNumberPrinter.counter);
		
		
		
		
		
		
		
		
		
		
	
	}

}
