package oOps_GettersnSetters;

public class House {
	private String hno;
	private int no_of_floors;
	private String location;
	private Boolean own;
	private Room room;

	public House() {
	}

	public House(String hno, int no_of_floors, String location, Boolean own,
			Room room) {
		this.hno = hno;
		this.no_of_floors = no_of_floors;
		this.location = location;
		this.own = own;
		this.room = room;
	}

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public int getNo_of_floors() {
		return no_of_floors;
	}

	public void setNo_of_floors(int no_of_floors) {
		this.no_of_floors = no_of_floors;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Boolean getOwn() {
		return own;
	}

	public void setOwn(Boolean own) {
		this.own = own;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public boolean equals(House h) {
		if (hno.equals(h.hno) && no_of_floors == h.no_of_floors
				&& location.equals(h.location) && own == h.own
				&& room.equals(h.room)) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return "hno = " + hno + ",no_of_floors = " + no_of_floors
				+ ",location = " + location + ",own = " + own + room;
	}

}
