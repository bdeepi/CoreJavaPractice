package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program finds the index of the given element in the array list
 * 
 * @author deepika
 * 
 */

public class FindingPosition {

	public static void main(String[] args) {
		
       
		Scanner sc = new Scanner(System.in);
		System.out.println("enter element to find the index");
		int key = sc.nextInt();
		
		System.out.println("Enter elements into the array");
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			al.add(sc.nextInt());
		}
		int indexis =findingIndexofgivenelement(al,key);
		System.out.println(indexis);
	}
		public static int findingIndexofgivenelement(ArrayList<Integer> al,int key){
			int index = -1;
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) == key) {
				index = i;
				
			}
		}
		return index;
		

	}

}
