package studentmanagementsystem;

public class Main {
	public static void main(String[] args) {
		StudentBuilder studentBuilder = new StudentBuilder();
		BranchBuilder branchBuilder = new BranchBuilder();

		Branch b1 = new Branch(1, "cse");
		Branch b2 = new Branch(2, "Ece");
		Branch b3 = new Branch(3, "Eee");

		branchBuilder.addBranch(b1);
		branchBuilder.addBranch(b2);
		branchBuilder.addBranch(b3);

		Student s1 = new Student(515, "Deepika", 90.00, 'A',
				branchBuilder.getBranch(1));
		Student s2 = new Student(516, "Swetha", 90.00, 'A',
				branchBuilder.getBranch(2));
		Student s3 = new Student(517, "venky", 90.00, 'B',
				branchBuilder.getBranch(3));

		studentBuilder.addStudent(s1);
		studentBuilder.addStudent(s2);
		studentBuilder.addStudent(s3);
		studentBuilder.printAllStudents();
		System.out.println(studentBuilder.removeStudent(s2.getId()));
		studentBuilder.printAllStudents();

	}

}
