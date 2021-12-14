package oOps_Object_in_class;

public class House {
	String house_no;
	int no_of_floors;
	boolean own;
	Room room;
	public String toString(){
		return room + ",house_no = "+ house_no + ",no_of_floors = "+no_of_floors+",own="+own;
	}

}
