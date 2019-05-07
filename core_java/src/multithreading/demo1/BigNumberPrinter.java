package multithreading.demo1;

public class BigNumberPrinter extends Thread {

	private String threadName;

	private boolean stop = false;

	public static int counter = 0;

	public synchronized void stopThread() {
		System.out.println("%%%% Setting STOP to true");
		this.stop = true;
	}

	private synchronized boolean keepRunning() {
		System.out.println("keepRunning(): " + (this.stop == false));
		return this.stop == false;
	}

	public BigNumberPrinter(String threadName) {
		super();
		this.threadName = threadName;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 20; i++) {
//			System.out.println(threadName + ": " + i);

			try {

				synchronized (this) {
					//incrementCounter();
					counter=counter+1;
					System.out.println(threadName + ": " + i + "\tCounter = " + counter);
					Thread.sleep(500);
					// Thread.yield();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("### BigNumberPrinter:: Exiting Thread");
	}

	private synchronized static void incrementCounter() {
		counter = counter + 1;
	}

}
