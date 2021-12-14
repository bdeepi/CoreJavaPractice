package oOps_GettersnSetters;

public class District {
	private String dname;

	public District() {
	}

	public District(String dname) {
		this.dname = dname;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public boolean equals(District d) {
		if (dname.equals(d.dname)) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return ",dname= " + dname;
	}
}
