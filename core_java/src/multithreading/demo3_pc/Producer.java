package multithreading.demo3_pc;

import java.util.List;

public class Producer implements Runnable{
	
	private final List<Integer> taskQueue;
	private final int MAX_CAPACITY;
	
	public Producer(List<Integer> taskQueue, int MAX_CAPACITY) {
		super();
		this.taskQueue = taskQueue;
		this.MAX_CAPACITY = MAX_CAPACITY;
	}

	@Override
	public void run() {
		
		
		int counter = 0;
		
		//for(int i=0; i<2; i++) {
			
		
		while(true) {
			try {
				producer(counter++);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

	private void producer(int i) throws InterruptedException {
		
		synchronized(taskQueue) {
			
			while(taskQueue.size() == MAX_CAPACITY) {
				System.out.println("Queue is full2: " + Thread.currentThread().getName() + " is waiting, size = " + taskQueue.size());
				System.out.println(Thread.currentThread().getName() + " state = " + Thread.currentThread().getState());
				taskQueue.wait();	
				
			}
			
			Thread.sleep(1000);
			taskQueue.add(i);
			System.out.println("Produced: " + i);
			
			taskQueue.notifyAll();
			
		}
		
	}
	
	

}
