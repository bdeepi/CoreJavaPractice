package oOps_List;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.name = "Deepika";
		t.school_name = "Sasi";
	  
	   
	   Subject telugu = new Subject();
	   telugu.subid = 01;
	   telugu.subject_name = "telugu";
	   
	   Subject english = new Subject();
	   english.subid = 02;
	   english.subject_name = "english";
	   
	   Subject maths = new Subject();
	   maths.subid = 03;
	   maths.subject_name = "maths";
	   
	   Subject hindi = new Subject();
	   hindi.subid = 04;
	   hindi.subject_name = "hindi";
	   
	   ArrayList<Subject> s = new ArrayList();
	   s.add(telugu);
	   s.add(english);
	   s.add(maths);
	   s.add(hindi);
	  System.out.println(s); 
	  
	  Human h = new Human();
	  h.name = "ram";
	  
	  Sport cricket = new  Sport();
	  cricket.sp_name = "cricket";
	  cricket.sp_id = 100;
	  
	  Sport hockey = new Sport();
	  hockey.sp_name = "hockey";
	  hockey.sp_id = 102;
	  
	  Sport kabbadi = new Sport();
	  kabbadi.sp_name = "kabbadi";
	  kabbadi.sp_id = 103;
	  
	  Sport shuttle = new Sport();
	  shuttle.sp_name = "shuttle";
	  shuttle.sp_id = 104;
	  
	  ArrayList<Sport> sp = new ArrayList();
	   
	    sp.add(cricket);
	    sp.add(hockey);
	    sp.add(kabbadi);
	    sp.add(shuttle);
	    
	   System.out.println(sp);
	   
	   House hou = new House();
	   hou.no_of_floors = 2;
	   
	   Room livingroom = new Room();
	   livingroom.r_id = 01;
	   livingroom.r_name = "livingroom";
	   
	   Room masterbedroom = new Room();
	   masterbedroom.r_id = 02;
	   masterbedroom.r_name = "masterbedroom";
	   
	   Room bedroom = new Room();
	   bedroom.r_id = 03;
	   bedroom.r_name = "bedroom";
	   
	   Room kitchen = new Room();
	   kitchen.r_id = 04;
	   kitchen.r_name = "kitchen";
	
	      
	   ArrayList<Room>  ro = new ArrayList();
	   ro.add(livingroom);
	   ro.add(masterbedroom);
	   ro.add(bedroom);
	   ro.add(kitchen);
	   
	   System.out.println(ro);
	   

	}

}
