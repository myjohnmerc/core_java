package inner_class;

public class InnerClassDemo {

	public static void main(String[] args) {

		OuterClass.InnerClass innerclass = new OuterClass("OuterDemo").new InnerClass();

		innerclass.innerMethod();

		System.out.println(innerclass.j);

		System.out.println("----- OUTER CLASS -----");
		new OuterClass("Class2").outerMethod();

		System.out.println("### @nd Type ###");
		new MethodLocalInnerClass().outerMethod();
		
		System.out.println("\n\n\n &&& test inner static method");
		
		StaticInnerClass.getInstance();
		StaticInnerClass.getInstance();
		
	
	}

}
