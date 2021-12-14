package arrayListmethods;

import java.util.ArrayList;
import java.util.Scanner;

public class Findingfirstpositionofgivenelement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key");
		int key = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Enter elements into the array");
		for(int i = 0; i < 5; i++){
			al.add(sc.nextInt());
		}
		System.out.println("firstposition of the given element "+findingfirstpositionofgivenelement(al,key) );
	}
	public static int findingfirstpositionofgivenelement(ArrayList<Integer> al,int key){
		int index = -1;
		for(int i = 0; i < al.size(); i++){
			if(key == al.get(i)){
				index = i;
				break;
				
			}
		}
		return index;
	}
}


