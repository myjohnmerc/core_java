package multithreading.demo1;

public class NumberPrinter implements Runnable {

	private String threadName;
	
	
	
	public NumberPrinter(String threadName) {
		super();
		this.threadName = threadName;
	}



	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			System.out.println(threadName + ": " + i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
