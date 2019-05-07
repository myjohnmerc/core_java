package multithreading.demo3_pc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

	public static void main(String[] args) throws InterruptedException {
		
		final List<Integer> taskQueue = new ArrayList<>();
		final int MAX_CAPACITY = 5;
		final int POOL_SIZE = 2;
		
		// threads
		Thread producer = new Thread(new Producer(taskQueue, MAX_CAPACITY), "Producer1");
		//Thread producer2 = new Thread(new Producer(taskQueue, MAX_CAPACITY), "Producer2");
		Thread consumer1 = new Thread(new Consumer(taskQueue, "Consumer1"));
		Thread consumer2 = new Thread(new Consumer(taskQueue, "Consumer2"));
		
		System.out.println("Executor service START");
		
		ExecutorService pool = Executors.newFixedThreadPool(POOL_SIZE);
		//pool.execute(consumer1);
	
		
		
		pool.execute(producer);
		//pool.execute(consumer2);
		
		System.out.println("Executor service SHUTDOWN --start");
		pool.shutdown();
		System.out.println("Executor service SHUTDOWN --end");
		
		
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
		Runtime runtime = Runtime.getRuntime();

		//runtime.addShutdownHook(new Thread(new ShutdownHookThread(), "SHUTDOWNHook"));
		//runtime.addShutdownHook(producer);
	
		
		Thread.sleep(5000);
		
		new Thread(new Consumer(taskQueue, "Consumer3")).start();
	
		
		System.out.println("Available Processors: " + runtime.availableProcessors());
		
		System.out.println("Free/Total memory: " + convertToMb(runtime.freeMemory()) + " / " + convertToMb(runtime.totalMemory()));
		System.out.println("Max Memory: " + convertToMb(runtime.maxMemory()));
		
		
	}
	
	
	private static double convertToMb(long memory) {
		return (memory/1024)/1024;
	}
	
	private synchronized static  void test(int num) {
		synchronized(ThreadPoolDemo.class) {
			System.out.println("");
		}
	}

}
