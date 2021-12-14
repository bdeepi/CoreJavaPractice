package oOps_Array_List;

public class Stud {
	private int id;
	private String name;
	private Character grade;
	private String gender;
	private Double percentage;
	private Stream stream;

	public Stud() {

	}

	public Stud(int id, String name, Character grade, String gender,
			Double percentage, Stream stream) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.gender = gender;
		this.percentage = percentage;
		this.stream = stream;
	}

	public int getId() {
		return id;
	}

	public void seId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Character getGrade() {
		return grade;
	}

	public void setGrade(Character grade) {
		this.grade = grade;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public Stream getStream() {
		return stream;
	}

	public void setStream(Stream stream) {
		this.stream = stream;
	}

	public String toString() {
		return "id = " + id + ",name = " + name + ",grade =" + grade
				+ ",gender = " + gender + "percentage = " + percentage + stream;
	}

}
