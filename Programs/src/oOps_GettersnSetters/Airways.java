package oOps_GettersnSetters;

public class Airways {

	private String a1;
	private String a2;

	public Airways() {
	}

	public Airways(String a1, String a2) {
		this.a1 = a1;
		this.a2 = a2;
	}

	public String getA1() {
		return a1;
	}

	public void setA1(String a1) {
		this.a1 = a1;
	}

	public String getA2() {
		return a2;
	}

	public void setA2(String a2) {
		this.a2 = a2;
	}

	public boolean equals(Airways a) {
		if (a1.equals(a.a1) && a2.equals(a.a2)) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return "a1 = " + a1 + ",a2 =" + a2;
	}

}
