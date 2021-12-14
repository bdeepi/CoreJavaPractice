package oOps_GettersnSetters;

public class Employee {
	private int id;
	private String name;
	private String location;
	private Boolean permanent;

	private Designation designation;

	public Employee() {
	}

	public Employee(int id, String name, String location, Boolean permanent,
			Designation designation) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.permanent = permanent;
		this.designation = designation;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Boolean getPermanent() {
		return permanent;
	}

	public void setPermanent(Boolean permanent) {
		this.permanent = permanent;
	}

	public Designation getDesignation() {
		return designation;

	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	public boolean equals(Employee e) {
		if (id == e.id && name.equals(e.name) && location.equals(e.location)
				&& permanent.equals(e.permanent)
				&& designation.equals(e.designation)) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return "id = " + id + ",name = " + name + ",location =" + location
				+ ",permanent =" + permanent + designation;
	}

}
