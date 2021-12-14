package oOps_Array_List;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
	public static void main(String[] args) {

		Branch1 b1 = new Branch1("cse", 1);
		Branch1 b2 = new Branch1("Ece", 2);
		Branch1 b3 = new Branch1("EEE", 3);
		Branch1 b4 = new Branch1("IT", 4);

		List<Branch1> list = new ArrayList<Branch1>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);

		Student1 s1 = new Student1(15, "deepu", 'c', b1);
		Student1 s2 = new Student1(16, "sai", 'c', b2);
		Student1 s3 = new Student1(17, "Surya", 'B', b3);
		Student1 s4 = new Student1(18, "Deep", 'B', b4);

		List<Student1> slist = new ArrayList<Student1>();
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);
		int count = 0;
		boolean flag = false;
		for (Student1 s : slist) {
			if (s.getGrade().equals('A')) {
				count++;
				flag = true;
			}
		}
		if (flag) {
			System.out.println("No.of students with grade A:" + count);
		}
		else {
			System.out.println("Null");
		}

	}

}
