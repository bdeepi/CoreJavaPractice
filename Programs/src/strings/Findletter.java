package strings;

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


