package oOps_GettersnSetters;

public class Sport {
	private int id;
	private String sname;
	
	public Sport(){}
	
	public Sport(int id, String sname){
		this.id = id;
		this.sname = sname;
	}
	
	public int getId(){
		return id;
	}
	public void SetId(int id){
		this.id = id;
	}
	public String getSname(){
		return sname;
	}
	public void setSname(String sname){
		this.sname = sname;
	}
	public String toString(){
		return ",id = " + id + ",sname = " + sname; 
	}

}
