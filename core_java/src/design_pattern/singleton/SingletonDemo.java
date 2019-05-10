package design_pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import design_pattern.singleton.threads.SingletonGrabber;

public class SingletonDemo {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException, SecurityException {
		
	//	B_EagerInitiWithStaticBlock instance = B_EagerInitiWithStaticBlock.getInstance();
		
		//System.out.println(Integer.toHexString(instance.hashCode()));
		
		new Thread(new SingletonGrabber(), "GR1").start();
		new Thread(new SingletonGrabber(), "GR2").start();
	
		
	
//		SingletonGrabber sg= new SingletonGrabber();
//		new Thread(sg, "GR1").start();
//		new Thread(sg, "GR2").start();
//		new Thread(sg, "GR3").start();
//		new Thread(sg, "GR4").start();
		/*
		 * D_ThreadSafeLazyInit instance = D_ThreadSafeLazyInit.getInstance();
		 * 
		 * D_ThreadSafeLazyInit instanceRef = null; Constructor[] cons =
		 * D_ThreadSafeLazyInit.class.getDeclaredConstructors();
		 * 
		 * System.out.println(instance);
		 * 
		 * 
		 * 
		 * Field[] fields = D_ThreadSafeLazyInit.class.getDeclaredFields();
		 * 
		 * 
		 * for(Field field: fields) { // field.set(field, null);
		 * System.out.println(field.toString()); field.setAccessible(true);
		 * field.set(instance, null); }
		 * 
		 * 
		 * 
		 * for(Constructor construct: cons) { construct.setAccessible(true); instanceRef
		 * = (D_ThreadSafeLazyInit) construct.newInstance(); }
		 */
		
		
		
		
		
		/*
		 * System.out.println(instanceRef);
		 * 
		 * System.out.println("------ -------------\n\n");
		 * 
		 * Z_EnumSingleton enumInst = Z_EnumSingleton.INSTANCE; enumInst.enumMethod();
		 * enumInst.test();
		 * 
		 * System.out.println(Z_EnumSingleton.class.getClassLoader());
		 * System.out.println(Object.class.getClassLoader());
		 */
		
		
	}

}
