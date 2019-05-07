package multithreading.demo3_pc;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerTest {

	public static void main(String[] args) throws InterruptedException   {
		
		final List<Integer> taskQueue = new ArrayList<>();
		final int MAX_CAPACITY = 5;
		
		Thread producer = new Thread(new Producer(taskQueue, MAX_CAPACITY), "Producer1");
		//Thread producer2 = new Thread(new Producer(taskQueue, MAX_CAPACITY), "Producer2");
		Thread consumer = new Thread(new Consumer(taskQueue, "Consumer1"), "Consumer");
		Thread consumer2 = new Thread(new Consumer(taskQueue, "CONSUMER2"), "Consumer2");
		
		//consumer.setPriority(Thread.MAX_PRIORITY);
		//producer.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("--- STARTING THREADS ---");
		producer.start();
		
		//producer.yield();
		consumer.start();
		
		
		//consumer2.start();
		
		if(consumer.isInterrupted()) {
			System.out.println("$$$ consumer is Inturrpted");
			consumer.stop();
		}
		
		Thread.sleep(10000);
		System.out.println("Inturrupting Consumer");
		consumer.interrupt();

		
	}

}
