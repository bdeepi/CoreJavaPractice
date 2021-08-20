package Programs;

import java.util.Scanner;

public class PPIncr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j ;//= sc.nextInt();
		int k = sc.nextInt();
		int l ;//= sc.nextInt();
		j = i++;
		l = ++k;
		
		System.out.println(i + ":" + j);
		System.out.println(k + ":" + l);
		
	}
}
