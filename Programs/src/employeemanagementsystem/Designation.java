package employeemanagementsystem;

public class Designation {

	private int id;
	private String location;

	public Designation() {

	}

	public Designation(int id, String location) {
		this.id = id;
		this.location = location;

	}

	public int getId() {
		return id;
	}

	public void setRole(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String toString() {
		return "id = " + id + "location = " + location;
	}
}
