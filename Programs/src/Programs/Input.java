package Programs;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  number - ");
		int a = sc.nextInt();
		System.out.println("number is " +a);
		System.out.print("Enter double number - ");
		double b = sc.nextDouble();
		System.out.println("double  is " +b);
		System.out.print("Enter character - ");
		char c = sc.next().charAt(0);
		System.out.println("char is" +c);
		System.out.print("Enter string - ");
		String str = sc.next();
		System.out.println("String is :" + str);
		

	}

}
