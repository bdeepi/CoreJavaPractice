package oOps_Object_in_class;

public class Student {
	int id;
	String name;
	String gender;
	String college;

	Branch br;

	public String toString() {
		return br + ",id = " + id + ", name = " + name  
				+ ", gender =" + gender + ",college ="+college;
				
	}
}
