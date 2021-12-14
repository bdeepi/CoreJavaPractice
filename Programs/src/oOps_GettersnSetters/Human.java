package oOps_GettersnSetters;

public class Human {
	private String name;
	private String location;

	private Sport sport;

	public Human() {
	}

	public Human(String name, String location, Sport sport) {
		this.name = name;
		this.location = location;
		this.sport = sport;
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

	public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}

	public boolean equal(Human h) {
		if (name.equals(h.name) && location.equals(h.location) && sport.equals(h.sport)) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return "name = " + name + "location = " + location + sport;
	}
}
