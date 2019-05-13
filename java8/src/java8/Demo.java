package java8;

import java8.functional_interface.SummableInterface;
import java8.functional_interface.UtilCaller;

public class Demo {
	public static void main(String[] args) {
		SummableInterface si = (a,b) -> a+b;
		
		System.out.println(UtilCaller.sum((x,y)->x+y, 10, 20));
	
		
				
	
	}
}
