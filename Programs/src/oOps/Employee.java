package oOps;

public class Employee {
	int id;
	String name;
	String role;
	double ann_highest_sal_inlakhs;
	double ann_lowest_sal_inlakhs;
	boolean permanent;
	int ann_leaves;
	int wrknghrs;
	String location;

	public String toString() {
		return "id = " + id + ",name = " + name + ",role = " + role
				+ ",ann_highest_sal_inlakhs = " + ann_highest_sal_inlakhs
				+ ",ann_lowest_sal_inlakhs = " + ann_lowest_sal_inlakhs
				+ ",permanent = " + permanent + ",ann_leaves = " + ann_leaves
				+ " ,wrknghrs = " + "location = " + location;
	}

}
