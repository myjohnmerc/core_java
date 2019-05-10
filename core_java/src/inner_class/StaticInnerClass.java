package inner_class;

public class StaticInnerClass {
	
	private static int staticData = 0;
	private int instanceData = 9;
	
	
	static {
		System.out.println("StaticInnerClass is being loaded");
	}
	
	public static final class InnerClass {
		private static final StaticInnerClass INSTANCE;
		static {
			System.out.println("InnerClass is being loaded");
			INSTANCE = new StaticInnerClass();
			
		}
		
		public void innerMethod() {
			System.out.println("Inner Method");
			System.out.println("data = " + new StaticInnerClass().instanceData);
		}
		
//		public static void main(String[] args) {
//			System.out.println("Inside main method of inner static class");
//		}
		
		
	}
	
	public static StaticInnerClass getInstance() {
		return InnerClass.INSTANCE;
	}
	
	

}
