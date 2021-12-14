package exceptions;

import java.util.Scanner;

public class InvalidAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age ");
		int age = sc.nextInt();
		try {
			if (age < 0) {
				throw new Exception(age + " Age cannot be negative");

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
