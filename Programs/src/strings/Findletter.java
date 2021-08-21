package strings;
/**
 * This program finds whether the given letter is present in the String or not
 * @author Deepika
 *
 */

public class Findletter {

	public static void main(String[] args) {
		int count = 0;
		char k = 'H';
		String str = "Hello";
		for(int i = 0;i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == k) {
				count = 1;
				break;
			}
		}
		if(count == 1) {
		System.out.println(k +" found");
		} else {
			System.out.println(" not found");
		}
	

	}
}


