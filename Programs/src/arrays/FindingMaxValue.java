package arrays;

import java.util.Scanner;

public class FindingMaxValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		System.out.println("Enter elements into the array");
		for(int i = 0; i < array.length; i++){
			array[i] = sc.nextInt();
		}
		int maximumvalueis = findingmaxvalue(array);
		System.out.println("The maximum value in the array is "+maximumvalueis);
	}
	public static int findingmaxvalue(int[] array){
		int max = array[0];
		for(int i = 0; i < array.length; i++){
			
			if(max < array[i]){
				max = array[i];
			}
		
		}
		return max;

	}

}
