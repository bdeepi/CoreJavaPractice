package strings;

public class Find {

	public static void main(String[] args) {
		char c;
		String str = "Abc123$%";
		
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c >= 65 && c <= 90) {
				System.out.println(c + " capital letter");
			} else if (c >= 97 && c <= 122) {
				System.out.println(c + " Small letter");
			} else if (c >= 47 && c <= 57) {
				System.out.println(c + " number");
			} else {
				System.out.println(c + " Special Character");
			}

		}

	}
}
