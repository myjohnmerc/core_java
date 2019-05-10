package design_pattern.singleton;

public enum Z_EnumSingleton {
	INSTANCE;
	
	public static void test() {
		System.out.println("inside static method test");
	}
	
	
	public void enumMethod() {
		System.out.println("Inside enumMethod()");
	}
	
	
	
}
