package java8.functional_interface;

public class UtilCaller {

	public static int sum(SummableInterface si, int a, int b) {
		return si.sum(a, b);
	}
	
}
