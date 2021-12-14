package oOps_Array_List;

public class Branch1 {
	private String name;
	private int id;
	
	public Branch1(){
		
	}
	public Branch1(String name, int id){
		this.name = name;
		this.id = id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String toString(){
		return "id = " + id + "name =" + name;
	}

}
