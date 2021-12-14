package arrayList;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * This program will end its loop when entering particular number and prints
 * the array elements excluding the particular number
 * @author deepika
 *
 */
public class Sample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Enter elements into the array");
		for (;;) {
			int n = sc.nextInt();
			if (n == 22) {
				break;
			}
			al.add(n);
		}
		System.out.println("The arrray list is ");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

	}

}
