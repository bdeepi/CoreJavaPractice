package oOps_Array_List;

public class Worker {
	private String name;
	
	private Job job;
	
	public Worker(){
		
	}
	public Worker(String name, Job job){
		this.name = name;
		this.job = job;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public Job getJob(){
		return job;
	}
	public void setJob(Job job){
		this.job = job;
	}
	public String toString(){
		return "name = " + name + job;
	}

}
