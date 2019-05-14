package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import java8.functional_interface.SummableInterface;
import java8.functional_interface.UtilCaller;

public class Demo {
	public static void main(String[] args) {
		SummableInterface si = (a, b) -> a + b;

		System.out.println(UtilCaller.sum((x, y) -> {

			if (x > y) {
				System.out.println("x is greater than y");
				return x - y;
			} else {
				return y - x;
			}

		}, 21, 20));

		new Thread(() -> {
			System.out.println("STARTING THREAD");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("STOPIING THREAD");
		}).start();

		List<Integer> list = new ArrayList<>();

		Integer[] array = new Integer[5];

		Arrays.fill(array, 10);

		list = Arrays.asList(array);

		System.out.println("Array length: " + array.length);
		list.forEach((Integer intObject) -> {
			System.out.println(intObject.intValue());
		});

		System.out.println("\n\n####\n\n");
		int number = 9;
		System.out.println("Number " + number + (isPrime(number) ? " is " : " is NOT ") + "prime");

	}

	// functional way of finding prime number
	private static boolean isPrime(int number) {
		return number > 1 && IntStream.range(2, number).noneMatch(index -> number % index == 0);

	}
}
