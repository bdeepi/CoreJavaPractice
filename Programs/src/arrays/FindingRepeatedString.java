package arrays;

import java.util.ArrayList;


public class FindingRepeatedString {

	public static void main(String[] args) {
		String array[] = { "hel", "hai", "hel", "how", "hai", "hello" };
		ArrayList<String> sal = repeatedstrings(array);
        System.out.println(sal);
	}
	public static ArrayList<String> repeatedstrings(String array[]){
		ArrayList<String> al = new ArrayList<String>();
		for(int i = 0; i < al.size() - 1; i++){
			for(int j = i + 1; j < al.size(); j++ ){
				if(array[i] == array[j]) {
					al.add(array[i]);
				}
			}
		}
		return al;
	}
	

}
