package structuralPatterns;

import java.util.ArrayList;

public class Employee {
	private int empId;
	private String empName;
	private String position;
	private ArrayList<Employee> subordinates;
	public Employee(int empId, String empName, String position) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.position = position;
		subordinates = new ArrayList<Employee>();
	}
	public void add(Employee employee) {
		subordinates.add(employee);
	}
	public void remove(Employee employee) {
		subordinates.remove(employee);
	}
	public ArrayList<Employee> getSubordinates() {
		return subordinates;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", position=" + position + "]";
	}
}
