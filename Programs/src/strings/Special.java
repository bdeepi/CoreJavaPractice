package strings;

public class Special {

	/**
	 * This program finds whether the given string is special(two vowels side by
	 * side) or not
	 * 
	 */
	public static void main(String[] args) {
		Special sp = new Special();
		String str = "aabb";
		boolean flag = false;
		for(int i = 0; i < str.length()- 1; i++) {
			char first = str.charAt(i);
			char second = str.charAt(i+1);
			if((sp.isovel(first)&&sp.isovel(second))){
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("special string");
		}else {
			System.out.println("not a special string");
		}
	}

	public  boolean isovel(char l) {
		if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u'
				|| l == 'A' || l == 'E' || l == 'I' ||l == 'O' || l == 'U') {
			return true;
		}else {
			return false;
		}

	}

}
