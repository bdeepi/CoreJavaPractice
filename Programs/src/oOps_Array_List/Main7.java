package oOps_Array_List;

import java.util.ArrayList;
import java.util.List;

public class Main7 {

	public static void main(String[] args) {
		Job1 j1 = new Job1("QA", 25000, 50000);
		Job1 j2 = new Job1("TL", 30000, 60000);

		List<Job1> jolist = new ArrayList<Job1>();
		jolist.add(j1);
		jolist.add(j2);

		Worker1 w1 = new Worker1("Deepika", j1);
		Worker1 w2 = new Worker1("Sai", j2);

		List<Worker1> wolist = new ArrayList<Worker1>();
		wolist.add(w1);
		wolist.add(w2);
		int min = Integer.MAX_VALUE;
		for (Worker1 wo : wolist) {
			if (min > wo.getJob1().getLsal()) {
				min = wo.getJob1().getLsal();
			}
		}
		System.out.println("Lowest sal in lsal " + min);

	}

}
