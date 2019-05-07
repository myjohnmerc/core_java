package multithreading.demo2;

public class Thread1 extends Thread {

	private Thread otherThread;
	
	private String name;
	
	

	public Thread1(String name) {
		super();
		this.name = name;
	}

	public Thread getOtherThread() {
		return otherThread;
	}

	public void setOtherThread(Thread otherThread) {
		this.otherThread = otherThread;
	}

	@Override
	public synchronized void run() {
		
		System.out.println(name + " -- START");
		try {
			CounterClass.counter ++ ;
			System.out.println(name + ":  other thread :" + this.otherThread.isInterrupted());
			System.out.println("incremented value = " + CounterClass.counter);
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + " -- END");
		
	
		
	}
	
	
}
