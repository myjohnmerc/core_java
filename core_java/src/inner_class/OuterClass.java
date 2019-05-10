package inner_class;

public class OuterClass {
	
	private String name;
	
	
	public OuterClass(String name) {
		super();
		this.name = name;
	}
	
	public void outerMethod() {
		System.out.println("outerMethod(): i = " + new InnerClass().i);
		System.out.println("outerMethod(): i = " + new InnerClass().j);
		
		System.out.println("outerMethod(): Calling innerMethod");
		
	}
	
	
	public final class InnerClass {
	
		private int i = 0;
		public int j = 9;
		
		public void innerMethod() {
			
			System.out.println("OuterClass: InnerClass: innerMethod()  = " );
		}
	}

}
