package employeemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeBuilder {
	List<Employee> employees = new ArrayList<Employee>();

	public boolean addEmployee(Employee e) {
		for (Employee emp : employees) {
			if (emp.getId() == e.getId()) {
				return false;
			}

		}
		return true;
	}

	public Employee getEmployee(int id) {
		for (Employee emp : employees) {
			if (emp.getId() == id) {
             return emp;
			}
		}
		return null;

	}

	public void printAllEmployees() {
		System.out.println();
		System.out.println("the employees are:");
		for (Employee emp : employees) {
			System.out.println(emp);

		}
	}

}
