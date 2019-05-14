package java8.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	private int salary;
	private Role role;

	private static List<Employee> list = new ArrayList<>();

	static {
		list.add(new Employee("Bruce", 10000, Role.DBA));
		list.add(new Employee("Tony", 10000, Role.DEVELOPER));
		list.add(new Employee("Jerry", 3000, Role.DEVELOPER));
		list.add(new Employee("Clark", 5000, Role.QA));
		list.add(new Employee("Kent", 7000, Role.QA));
	}

	
	public Employee(String name, int salary, Role role) {
		super();
		this.name = name;
		this.salary = salary;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", role=" + role + "]";
	}

	// static method to return dummy data
	public static List<Employee> getEmployees() {

		return list;
	}

}
