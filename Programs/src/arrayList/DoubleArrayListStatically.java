package arrayList;

import java.util.ArrayList;
/**
 * This program prints the Double array list statically
 * @author deepika
 *
 */

public class DoubleArrayListStatically {

	
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(5.66);
		al.add(11.66);
		al.add(16.57890);
		al.remove(11.666);
		System.out.println("The Array List is");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));

		}
		System.out.println(al.size());

	}

}
