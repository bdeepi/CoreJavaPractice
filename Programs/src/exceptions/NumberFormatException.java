package exceptions;

public class NumberFormatException {

	public static void main(String[] args) {
		String s = "deepu";

		try {
			int i = Integer.parseInt(s);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
