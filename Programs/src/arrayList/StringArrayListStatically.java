package arrayList;

import java.util.ArrayList;

public class StringArrayListStatically {

	/**
	 * This program reads and prints the string datatype array list statically
	 * @author deepika
	 */
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sai");
		al.add("Surya");
		al.add("Deepika");
		al.add("Balijepalli");
		al.add("Tanuku");
		System.out.println("The array list is " + al);
		al.remove("Tanuku");
		System.out.println("The array list after updating" + al);

	}

}
