package multithreading.demo4_sync;

public class MyRunnable implements Runnable {

	public int counter = 0;

	ThreadLocal<Integer> treadLocal = new ThreadLocal<Integer>() {
		@Override protected Integer initialValue() {
	        return 0;
	    }
	};
	
	

	public MyRunnable() {
		super();
		//treadLocal.set(0);
	}



	@Override
	public void run() {
		
		for (int i = 1; i <= 5; i++) {
			
			counter = counter + 1;
			int val = treadLocal.get() + 1;
			treadLocal.set(val);
			
		//	System.out.println("Thread Local Value = " + treadLocal.get());
			
			//System.out.println(Thread.currentThread().getName() + " has inc i = " + i + " -- counter = " + counter);
			System.out.println(Thread.currentThread().getName() + " has inc i = " + i + " -- treadLocal = " + treadLocal.get());
		}

	}

}
