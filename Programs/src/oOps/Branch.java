package oOps;

public class Branch {
	String branch_name;
	String hodname;
	int branch_id;
	int number_of_seats;
	int number_of_sections;
	int number_of_semesters;
	int number_of_labs;
	int number_of_subjects;
	int fees;
	double passpercentage;


	public String toString() {
		return "branch_id =" + branch_id + ",number_of_seats ="
				+ number_of_seats + ",number_of_sections ="
				+ number_of_sections + ",number_of_semesters ="
				+ number_of_semesters + ",number_of_labs =" + number_of_labs
				+ ",number_of_subjects =" + number_of_subjects + ",fees = "
				+ fees + ",passpercentage = " + passpercentage;
	}
}
