package arrays;
import java.util.Scanner;
/**
 * This programs performs sum of any two number present in the array and that sum should be equal to the given random number
 * @author admin
 *
 */
public class Sample4 {

	public static void main(String[] args) {

		int key = 6;
		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		boolean flag = false;
		System.out.println("enter elements into the array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		// 1 2 3 4 5 6
		
		for(int i = 0; i < array.length-1; i++){
			
			for(int j = i + 1; j < array.length; j++){
				if(key == array[i] + array[j]){
					//sum = key;
					flag = true;
				}
			}
		}
         if(flag){
        	 System.out.println("It is a super array");
         }else{
        	 System.out.println("It is a not a super array");
         }
	}
}

