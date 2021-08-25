package basicPrograms;
/**
 * This Program is performing addition of two numbers.
 * @author Deepika
 *
 */
public class Add {

	public static void main(String[] args) {
		Add obj = new Add(); 
		int c = obj.add(1, 2);
		 System.out.print(c);	
	}
	/**
	 * 
	 * This method will add the two given numbers
	 * @param a - first number
	 * @param b - second number
	 * @return addition of two numbers
	 */
	public  int add(int a, int b) {
		 return a + b; 
	}

}
