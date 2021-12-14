package arrayList;

import java.util.ArrayList;
/**
 * This program prints the Integer array list statically
 * @author deepika
 *
 */


public class IntergerArrayListStatically {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(45);
		al.add(100);
		al.add(13);
		al.add(25);
		System.out.println("The Array list is");
		//for (int i = 0; i < al.size(); i++) {
			System.out.println(al);
			
			
		//}

	}

}
