package exceptions;

import java.util.Scanner;

public class InvalidName  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String str = sc.next();
		try {
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (c >= 48 && c <= 57) {
					throw new Exception(str + " :The Entered Name is Invalid");
				}

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
