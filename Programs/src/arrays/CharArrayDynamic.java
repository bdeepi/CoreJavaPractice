package arrays;

import java.util.Scanner;

public class CharArrayDynamic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char array[] = new char[4];
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.next().charAt(0);
		}
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] +" ");
		}
		
	

	}

}
