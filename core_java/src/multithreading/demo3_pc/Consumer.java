package multithreading.demo3_pc;

import java.util.List;

public class Consumer implements Runnable {

	private final List<Integer> taskQueue;
	private final String name;
	
	
	public Consumer(List<Integer> taskQueue, String name) {
		super();
		this.taskQueue = taskQueue;
		this.name = name;
	}


	@Override
	public void run() {
				
		// for(int i=0; i<5; i++) {
		while(true && !Thread.interrupted()) {
			try {
				System.out.println("$$$ Calling consume() START: int? " + Thread.interrupted());
				consume();
				System.out.println("$$$ Calling consume() EXIT");
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}


	private void consume() throws InterruptedException {
		
		synchronized(taskQueue) {
			
			while(taskQueue.isEmpty()) { 
				System.out.println("Queue is empty " + name + " is waiting , size: " + taskQueue.size());
	            taskQueue.wait();
				
			}
			
			Thread.sleep(1000);
			Integer item = taskQueue.remove(0);
			System.out.println(name + ": Consumed: " + item);
			taskQueue.notifyAll();
			
		}
		
	}

}
