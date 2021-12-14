package oOps_GettersnSetters;

public class Student {

	private int id;
	private String name;
	private String gender;
	private char section;

	private Branch branch;

	public Student() {
	}

	public Student(int id, String name, String gender, char section,
			Branch branch) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.section = section;
		this.branch = branch;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public char getSection() {
		return section;
	}

	public void setSection(char section) {
		this.section = section;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public boolean equals(Student s) {
		if (id == s.id && name.equals(s.name) && gender.equals(s.gender)
				&& section == s.section && branch.equals(s.branch)) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return branch + ",id =" + id + ",name = " + name + ",gender = "
				+ gender + ",section = " + section;
	}

}
