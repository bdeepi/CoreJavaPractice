package oOps_Array_List;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		Stream st1 = new Stream(1, "cse");
		Stream st2 = new Stream(2, "Ece");
		Stream st3 = new Stream(3, "IT");

		List<Stream> stlist = new ArrayList<Stream>();
		stlist.add(st1);
		stlist.add(st2);
		stlist.add(st3);

		Stud s1 = new Stud(15, "Ram", 'A', "male", 80.01, st1);
		Stud s2 = new Stud(16, "Charan", 'A', "male", 75.00, st2);
		Stud s3 = new Stud(17, "Teju", 'B', "female", 67.90, st3);

		List<Stud> List = new ArrayList<Stud>();
		List.add(s1);
		List.add(s2);
		List.add(s3);
		int count = 0, count1 = 0;
		for (Stud s : List) {
			if (s.getGender().equals("male")) {
				count++;
			}
			if (s.getGender().equals("female")) {
				count1++;
			}

		}
		System.out.println("No.of males " + count);
		System.out.println("No.of females" + count1);
	}

}