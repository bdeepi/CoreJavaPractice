package oOps;

public class District {
	String name;
	int population_in_lakhs;
	double sqkm;
	int mandals;
	int agrland_in_sqkm;
	int rivers;

	public String toString() {
		return "name = " + name + ",population_in_lakhs = "
				+ population_in_lakhs + ",sqkm = " + sqkm + ",mandals = "
				+ mandals + ",agrland_in_sqkm = " + agrland_in_sqkm
				+ ",rivers = " + rivers;
	}

}
