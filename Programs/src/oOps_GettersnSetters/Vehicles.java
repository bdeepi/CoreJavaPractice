package oOps_GettersnSetters;

public class Vehicles {

	private String v1;
	private String v2;
	private String v3;
	private Airways airways;

	public Vehicles() {
	}

	public Vehicles(String v1, String v2, String v3, Airways airways) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
		this.airways = airways;
	}

	public String getV1() {
		return v1;
	}

	public void setV1(String v1) {
		this.v1 = v1;
	}

	public String getV2() {
		return v2;
	}

	public void setV2(String v2) {
		this.v2 = v2;
	}

	public String getV3() {
		return v3;
	}

	public void setV3(String v3) {
		this.v3 = v3;
	}

	public Airways getAirways() {
		return airways;
	}

	public void setAirways(Airways airways) {
		this.airways = airways;
	}

	public boolean equals(Vehicles v) {
		if (v1.equals(v.v1) && v2.equals(v.v2) && v3.equals(v.v3)
				&& airways.equals(v.airways)) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return "v1 =" + v1 + "v2 = " + v2 + "v3 = " + v3 + "airways = "
				+ airways;
	}

}
