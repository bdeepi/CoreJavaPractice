package oOps_Array_List;

public class Worker1 {
	private String name;
	
	private Job1 job1;
	
	public Worker1(){
		
	}
	public Worker1(String name, Job1 job1){
		this.name = name;
		this.job1 = job1;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public Job1 getJob1(){
		return job1;
	}
	public void setJob(Job1 job1){
		this.job1 = job1;
	}
	public String toString(){
		return "name = " + name + job1;
	}

}



