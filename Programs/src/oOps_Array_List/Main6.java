package oOps_Array_List;

import java.util.ArrayList;
import java.util.List;

public class Main6 {

	public static void main(String[] args) {
		Job j1 = new Job("QA", 25000, 50000);
		Job j2 = new Job("TL", 30000, 60000);

		List<Job> jlist = new ArrayList<Job>();
		jlist.add(j1);
		jlist.add(j2);

		Worker w1 = new Worker("Deepika", j1);
		Worker w2 = new Worker("Sai", j2);

		List<Worker> wlist = new ArrayList<Worker>();
		wlist.add(w1);
		wlist.add(w2);
		int max = Integer.MIN_VALUE;
		for (Worker w : wlist) {
			if (max < w.getJob().getHsal()) {
				max = w.getJob().getHsal();
			}
		}
		System.out.println("Highest sal in hsal " + max);

	}

}
