package basicPrograms;
/**
 * This Program is performing addition of two numbers.
 * @author Deepika
 *
 */
public class Add {

	public static void main(String[] args) {
		 
		int c = add(1, 2);
		 
		 System.out.print(c);	
	}
	/**
	 * 
	 * This method will add the two given numbers
	 * @param a - first number
	 * @param b - second number
	 * @return addition of two numbers
	 */
	public static int add(int a, int b) {
		 return a + b; 
	}

}
