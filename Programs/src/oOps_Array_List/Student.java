package oOps_Array_List;

public class Student {
	
	private Integer id ;
	private String name;
	private Double percentage;
	private Character section;
	
	private Branch branch;
	public Student(){
		
	}
	public Student(int id , String name ,Double percentage,Character section,Branch branch){
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		this.section = section;
		this.branch = branch;
	}
	
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public Double getPercentage(){
		return percentage;
	}
	public void setPercentage(Double percentage){
		this.percentage = percentage;
	}
	public Character getSection(){
		return section;
	}
	public void setSection(Character section){
		this.section = section;
	}
	public Branch getBranch(){
		return branch;
	}
	public void setBranch(Branch branch){
		this.branch = branch;
	}
	
	public String toString(){
		return "id = " + id + ",name = " + name + ",percentage =" + percentage + ",section = " + section + branch; 
	}
	

}
