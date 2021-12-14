package oOps_GettersnSetters;

public class Room {
	private int norooms;
	private int nodoors;

	public Room() {
	}

	public Room(int norooms, int nodoors) {
		this.norooms = norooms;
		this.nodoors = nodoors;
	}

	public int getNorooms() {
		return norooms;
	}

	public void setNorooms(int norooms) {
		this.norooms = norooms;
	}

	public int getNodoors() {
		return nodoors;
	}

	public void setNodoors(int nodoors) {
		this.nodoors = nodoors;
	}

	public String toString() {
		return ",norooms = " + norooms + ",nodoors = " + nodoors;
	}

}
