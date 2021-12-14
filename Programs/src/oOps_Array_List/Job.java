package oOps_Array_List;

public class Job {

	private String name;
	private int hsal;
	private int lsal;

	public Job() {
	}

	public Job(String name, int hsal, int lsal) {
		this.name = name;
		this.hsal = hsal;
		this.lsal = lsal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public int getHsal() {
		return hsal;
	}

	public void setHsal(int hsal) {
		this.hsal = hsal;

	}

	public int getLsal() {
		return lsal;
	}

	public void setLsal(int lsal) {
		this.lsal = lsal;

	}

	public String toString() {
		return "name = " + name + ",hsal =" + hsal + ",lsal = " + lsal;
	}

}
