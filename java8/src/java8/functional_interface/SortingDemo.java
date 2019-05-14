package java8.functional_interface;

import java.util.Comparator;
import java.util.List;

import java8.model.Employee;

public class SortingDemo {

	public static void main(String[] args) {

		List<Employee> empList = Employee.getEmployees();

		System.out.println("--- Normal Listing ---");
		empList.forEach(System.out::println);

		System.out.println("\n--- Sorted by Name ---");
		/*
		 * empList.sort(new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o1, Employee o2) {
		 * 
		 * return o1.getName().compareToIgnoreCase(o2.getName()); } });
		 */

		empList.sort((Employee o1, Employee o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
		empList.forEach(System.out::println);

		System.out.println("\n--- Sorted by Salary ---");
		empList.sort((Employee o1, Employee o2) -> o1.getSalary() - o2.getSalary());
		empList.forEach(System.out::println);

		System.out.println("\n--- Sorted by Salary and Name ---");
		empList.sort((Employee o1, Employee o2) -> {
			if (o1.getSalary() == o2.getSalary()) {
				return o1.getName().compareToIgnoreCase(o2.getName());
			} else {
				return o1.getSalary() - o2.getSalary();
			}

		});
		empList.forEach(System.out::println);
		
		
		System.out.println("\n--- Sorted by Role ---");
		
		Comparator<Employee> comparatorRole = (o1, o2)->o1.getRole().compareTo(o2.getRole());
		
		Comparator<Employee> compareByName = (o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName());
		
		Comparator<Employee> compareBySalary = (o1, o2) -> o1.getSalary() - o2.getSalary();
		
		empList.sort(compareBySalary.reversed().thenComparing(compareByName.reversed()));
		empList.forEach(System.out::println);

	}

}
