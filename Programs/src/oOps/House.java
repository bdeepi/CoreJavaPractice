package oOps;

public class House {
	double no_sq_feet;
	int no_of_floors;
	int no_of_rooms;
	int no_of_bedrooms;
	double hall_width;
	double kitchen_width;
	String face_of_entrance;
	boolean own;

	public String toString() {
		return "no_sq_feet = " + no_sq_feet + ",no_of_floors = " + no_of_floors
				+ ", no_of_rooms =" + no_of_rooms + ",no_of_bedrooms = "
				+ no_of_bedrooms + "hall_width =, " + hall_width
				+ "kitchen_width =, " + kitchen_width + ",face_of_entrance =  "
				+ face_of_entrance + ",own =  " + own;
	}

}
