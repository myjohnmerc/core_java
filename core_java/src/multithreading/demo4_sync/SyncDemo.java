package multithreading.demo4_sync;

public class SyncDemo {

	public static void main(String[] args) throws InterruptedException {
		
		MyRunnable run1 = new MyRunnable();
		
		Thread t1 = new Thread(run1, "TR1");
		Thread t2 = new Thread(run1, "TR2");

		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		while(t1.isAlive() || t2.isAlive()) {
			
		}
		
		System.out.println("### Final Counter = " + run1.counter);
		
	}

}
