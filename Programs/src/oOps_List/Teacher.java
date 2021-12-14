package oOps_List;

import java.util.ArrayList;

public class Teacher {
	String name;
	String school_name;
	ArrayList<Subject> subjects;

	
	public String toString(){
		return  ",name = " + name +",school_name"+school_name + "subjects = " + subjects;
	}

}
