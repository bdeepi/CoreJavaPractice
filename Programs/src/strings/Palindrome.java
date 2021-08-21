package strings;
/**
 * This program finds whether the given string is palindrome or not
 * @author Deepika
 *
 */

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam";
		String s = "";
		for(int i = str.length()- 1; i >= 0; i--) {
         s = s + str.charAt(i);  
		}
		if(str.equals(s)) {
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}

	}

}

