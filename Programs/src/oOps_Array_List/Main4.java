package oOps_Array_List;

import java.util.ArrayList;
import java.util.List;

public class Main4 {

	public static void main(String[] args) {
		Sport s1 = new Sport(100, "cricket");
		Sport s2 = new Sport(101, "Tennis");
		Sport s3 = new Sport(102, "Football");

		List<Sport> slist = new ArrayList<Sport>();
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);

		Human h1 = new Human("Sachin", s1);
		Human h2 = new Human("Sania", s2);
		Human h3 = new Human("Ronaldo", s1);

		List<Human> hlist = new ArrayList<Human>();
		hlist.add(h1);
		hlist.add(h2);
		hlist.add(h3);
		int count = 0;
		for (Human h : hlist) {
			if (h.getSport().getName().equals("cricket")) {
				count++;
			}
		}
		System.out.println("The no.of players playing cricket : " + count);

	}

}
