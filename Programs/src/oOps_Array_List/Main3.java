package oOps_Array_List;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
	public static void main(String[] args) {

		Designation d1 = new Designation("QA", "HYD");
		Designation d2 = new Designation("TL", "HYD");
		Designation d3 = new Designation("Manager", "HYD");

		List<Designation> dlist = new ArrayList<Designation>();
		dlist.add(d1);
		dlist.add(d2);
		dlist.add(d3);

		Employee e1 = new Employee(101, "Deepika", d1);
		Employee e2 = new Employee(102, "Sai", d2);
		Employee e3 = new Employee(103, "Surya", d2);

		List<Employee> elist = new ArrayList<Employee>();
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		int count = 0;
		for (Employee e : elist) {
			if (e.getDesignation().getRole().equals("TL")) {
				count++;
			}
		}
		System.out.println("No .of employees designated TL role :" + count);

	}
}
