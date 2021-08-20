package strings;

public class FNSC {

	public static void main(String[] args) {
		int count = 0, count1 = 0;
		String str = "Iam An Indian";
		for(int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			if(c >= 65 && c <= 90) {
				count++;
			} else if(c >= 97 && c <= 122) {
				count1++;
			}
		}
		System.out.println("No. of capital letters " + count);
		System.out.println("No. of small letters " + count1);

	}

}
