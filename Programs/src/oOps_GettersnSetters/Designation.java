package oOps_GettersnSetters;

public class Designation {
	private String name;
	private char band;

	public Designation() {
	}

	public Designation(String name, char band) {
		this.name = name;
		this.band = band;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getBand() {
		return band;
	}

	public void setBand(char band) {
		this.band = band;
	}
	public boolean equals(Designation d){
		if(name.equals(d.name) && band == d.band){
			return true;
		}else{
			return false;
		}
	}

	public String toString() {
		return ",name = " + name + ", band = " + band;
	}

}
