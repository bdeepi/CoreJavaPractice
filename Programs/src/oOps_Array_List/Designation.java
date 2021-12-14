package oOps_Array_List;

public class Designation {
	private String role;
	private String location;

	public Designation() {

	}

	public Designation(String role, String location) {
		this.role = role;
		this.location = location;

	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	public String toString(){
		return "role = " + role + "location = " + location;
	}
}
