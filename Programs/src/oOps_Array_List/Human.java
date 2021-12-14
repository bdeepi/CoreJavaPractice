package oOps_Array_List;

public class Human {
	private String name;
	private Sport sport;
	public Human(){
		
	}
	public Human(String name,Sport sport){
		this.name = name;
		this.sport = sport;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public Sport getSport(){
		return sport;
	}
	public void setSport(Sport sport){
		this.sport = sport;
	}
	public String toString(){
		return "name = " + name + sport;
	}


}
