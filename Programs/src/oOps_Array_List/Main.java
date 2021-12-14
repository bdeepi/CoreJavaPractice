package oOps_Array_List;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Branch b1 = new Branch(1, "cse");
		Branch b2 = new Branch(2, "ece");
		Branch b3 = new Branch(3, "eee");
		Branch b4 = new Branch(4, "it");

		List<Branch> list = new ArrayList<Branch>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);

		Student s1 = new Student(1, "Deepika", 90.02, 'A', b1);
		Student s2 = new Student(2, "Sai", 80.00, 'A', b1);
		Student s3 = new Student(3, "Surya", 70.06, 'B', b1);
		Student s4 = new Student(4, "Deepu", 75.09, 'B', b4);

		List<Student> stlist = new ArrayList<Student>();
		stlist.add(s1);
		stlist.add(s2);
		stlist.add(s3);
		stlist.add(s4);

		int count = 0;
		for (Student s : stlist) {
			if (s.getBranch().getBname().equals("cse")) {
				count++;
			}

			System.out.println("The number of students from cse branch :"
					+ count);

		}

	}
}
