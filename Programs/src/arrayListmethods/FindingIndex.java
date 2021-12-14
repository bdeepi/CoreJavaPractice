package arrayListmethods;

import java.util.ArrayList;
import java.util.Scanner;

public class FindingIndex {
	public static void main(String[] args) {
		int key = 5;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Enter elements into the array ");
		for(int i = 0; i < 5; i++){
			al.add(sc.nextInt());
		}
		int result = findingIndex(al,key);
		System.out.println(" Key elements found at " + findingIndex(al,key));
	}
	public static int findingIndex(ArrayList<Integer> al , int key){
		int id;
		int index = -1;
		for(int i = 0; i < al.size(); i++){
			if(key == al.get(i)){
				index = i;
				
			}
		}
		return index;
		
	}

}
