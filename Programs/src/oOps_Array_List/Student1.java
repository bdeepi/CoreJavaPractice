package oOps_Array_List;

public class Student1 {
	private Integer id;
	private String name;
	private Character grade;
	private Branch1 branch1;
	
	public Student1(){
		
	}
	public Student1(Integer id, String name, Character grade,Branch1 branch1){
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.branch1 = branch1;
	}

	public Integer getInteger() {
		return id;
	}

	public void setInteger(int id) {
		this.id = id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public Character getGrade(){
		return grade;
	}
	public void setGrade(Character grade){
		this.grade = grade;
	}
	public Branch1 getBranch1(){
		return branch1;
	}
	public void setBranch(Branch1 branch1){
		this.branch1 = branch1;
		
	}
	
	public String toString(){
		return "id =" + id + ",name = " + name + ",grade = " + grade + branch1;
	}
}
