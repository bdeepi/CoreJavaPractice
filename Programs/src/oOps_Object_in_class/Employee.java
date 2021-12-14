package oOps_Object_in_class;

public class Employee {
	int id;
	String name;
	String role;
	boolean permanent;

	Designation designation;

	public String toString() {
		return designation + "id = " + id + ",name = " + name + ",role = "
				+ role + ",permanent = " + permanent;

	}
}
