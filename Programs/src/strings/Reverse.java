package strings;
/**
 * This program finds the reverse of a given String
 * 
 * @author Deepika
 *
 */
public class Reverse {

	public static void main(String[] args) {
		String str = "Deepika";
		String sb = "";
		for(int i = str.length() - 1; i >= 0; i--) {
          sb = sb + str.charAt(i);
		}
		System.out.println(str + " " +sb);

	}

}


