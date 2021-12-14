package oOps_Array_List;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
	public static void main(String[] args) {
		College c1 = new College("Sasi","TPG");
		College c2 = new College("Vasavi","PTPG");
		College c3 = new College("Vishnu","BMVRM");
		
		List<College> clist = new ArrayList<College>();
		clist.add(c1);
		clist.add(c2);
		clist.add(c3);
		
		Pupil p1 = new Pupil(515,"Deepika",90.09,c1);
		Pupil p2 = new Pupil(515,"Sai",92.09,c2);
		Pupil p3 = new Pupil(515,"Surya",85.09,c3);
		
		List<Pupil> plist = new ArrayList<Pupil>();
		
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		Double max = Double.MIN_VALUE,min = Double.MAX_VALUE;
		for(Pupil p : plist){
			if(max < p.getPercentage()){
				max = p.getPercentage();

			}
			if(min > p.getPercentage()){
				min = p.getPercentage();
			}
		
		}
		System.out.println("Highest percentage among students: " +max);
		System.out.println("Lowest percentage among students: " + min);

	}

}
