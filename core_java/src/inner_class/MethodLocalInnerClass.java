package inner_class;

public class MethodLocalInnerClass {

	private int outVar = 0;
	public void outerMethod() {
		System.out.println("outerMethod(): Inside outerMethod");
		final int methodVar;
		methodVar = 9;
		class InnerClass {
			
			public void innerMethod() {
				System.out.println("innerMethod(): outVar = " + outVar);
	
				System.out.println("innerMethod(): outVar = " + methodVar);
			}
		}
		
		System.out.println("outerMethod(): Calling innerMethod");
		new InnerClass().innerMethod();
		
		
	}
	
	
}
