package oOps_Array_List;

public class College {
	private String name;
	private String location;

	public College() {

	}

	public College(String name, String location) {
		this.name = name;
		this.location = location;
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

	public String toString() {
		return "name = " + name + "Location =" + location;

	}

}
