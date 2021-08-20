package strings;

public class FindnVC {

	public static void main(String[] args) {
		int count = 0, count1 = 0;
		String str = "Finding number of vowels and consonants";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if ((str.charAt(i) == 'a') || (str.charAt(i) == 'e')
					|| (str.charAt(i) == 'i') || (str.charAt(i) == 'o')
					|| (str.charAt(i) == 'u') || (str.charAt(i) == 'A')
					|| (str.charAt(i) == 'E') || (str.charAt(i) == 'I')
					|| (str.charAt(i) == 'O') || (str.charAt(i) == 'U')) {
				count++;
			} else {
				count1++;
			}

		}
		System.out.println("Number of vowels " + count);
		System.out.println("Number of consonants " + count1);

	}

}
