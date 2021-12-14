package arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class Singleoccurence {

	public static void main(String[] args) {
		String array[] = { "hel", "hai", "hel", "how", "hai", "hello" };
		HashSet<String> hs = findingSingleocurrence(array);
		System.out.println(hs);

	}

	public static HashSet<String> findingSingleocurrence(String array[]) {
		HashSet<String> hs = new HashSet<String>();
		for (String s : array) {
			hs.add(s);
		}
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j])
					al.add(array[i]);

			}
		}
		for (String s : al) {
			
			hs.remove(s);

		}

		return hs;

	}

}
