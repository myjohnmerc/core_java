package multithreading.demo2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1("TT1");
		Thread1 t2 = new Thread1("TT2");
		
		t1.setOtherThread(t2);
		t2.setOtherThread(t1);
		
		t1.start();
		t2.start();
		
		while(t1.isAlive() || t2.isAlive()) {
			
		}
		
	
		
		System.out.println(" --------- Final Counter = " + CounterClass.counter);
	}

}
