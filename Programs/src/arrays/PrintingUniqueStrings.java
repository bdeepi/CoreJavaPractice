package arrays;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * This program prints the unique strings i.e without duplicates
 * 
 * @author deepika
 * 
 */

public class PrintingUniqueStrings {

	public static void main(String[] args) {
		String array[] = { "hel", "hai", "hel", "how", "hai", "hello" };
		HashSet<String> str = printsuniqueelements(array);
		System.out.println("unique elements in the string array " + str);
        
	}

	public static HashSet<String> printsuniqueelements(String[] array) {
		HashSet<String> hs = new HashSet<String>();
		for (String s : array) {
			hs.add(s);

		}
		
		return hs;
	}

}
