package basicPrograms;
import java. util.Scanner; 
public class Perfect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isperfect = perfect(n);
		if (isperfect) {
			System.out.println("perfect number");
		} else {
			System.out.println("not a perfect number");
		}

	}

	public static boolean perfect(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (n == sum) {
			return true;
		} else {
			return false;
		}
	}

}
