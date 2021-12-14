package exceptions;

public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6 };
		try {

			for (int i = 0; i <= array.length; i++) {
				System.out.println(array[i]);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
