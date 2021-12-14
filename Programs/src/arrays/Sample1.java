package arrays;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {//main method
		Scanner sc = new Scanner(System.in); // to obtain the user input
		System.out.println("How many states you want to enter");
		int n = sc.nextInt(); //this method to take the input from user and we are storing the user input in "int n"
		String array[] = new String[n];//declaring and initializing the array and also the size
		System.out.println("Enter the states to print in the array ");
		for(int i = 0; i < array.length; i++) {  // to read the elements entered by the user
			array[i] = sc.next();
		}
		for(int i = 0; i < array.length; i++) { //displaying or accessing the elements
		System.out.println("the states you entered " + array[i]);
		}

	}
}
