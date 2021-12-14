package employeemanagementsystem;



public class Employee {

	private int id;
	private String name;
	//private Designation designation;

	public Employee() {

	}

	public Employee(int id, String name/* Designation designation*/) {
		this.id = id;
		this.name = name;
		//this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}*/

	public String toString() {
		return "id = " + id + "name = " + name ;
	}

}
