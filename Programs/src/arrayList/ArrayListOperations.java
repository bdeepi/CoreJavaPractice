package arrayList;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * This program performs the add(), remove() , get() operations of ArrayList
 * @author deepika
 *
 */

public class ArrayListOperations {
	public static void main(String[] args) {
		System.out.println("Enter elemnets into the array");
		Add();
		Remove();
		

	}
	public static void Add(){
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(48);
		al.add(59);
		al.add(99);
		al.add(100);
		System.out.println(al);
		
	}
	public static void Remove(){
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.remove(48);
		System.out.println(al);
	}

}
