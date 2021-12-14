package oOps_Array_List;

public class Pupil {
	private int id;
	private String name;
	private Double percentage;
	private College college;

	public Pupil() {

	}

	public Pupil(int id, String name, Double percentage,College college) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		this.college = college;
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

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	public College getCollege(){
		return college;
	}
	public void setCollege(College college){
		this.college = college;
	}
	public String toString(){
		return "id = " + id + ",name = " + name + ",percentage =" + percentage + college;
	}

}
