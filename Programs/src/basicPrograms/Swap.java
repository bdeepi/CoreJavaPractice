package basicPrograms;
/**
 * This program performs the swapping of two numbers
 * @author deepika
 *
 */
public class Swap {

	public static void main(String[] args) {
		swap(2 , 3);
		
	}
	/**
	 * This method performs the swapping of two numbers 
	 * @param a
	 * @param b
	 */
	public static void swap(int a , int b ) {
		
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("Swap of a and b is " + a + " " + b );
		
		
		
	}


}
