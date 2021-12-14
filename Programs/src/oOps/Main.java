package oOps;

public class Main {

	public static void main(String[] args) {
	
		Student s1 = new Student();
		s1.id = 15;
		s1.name = "Deepika";
		s1.branch = "cse";
		s1.gender = "female";
		s1.section = 'A';
		s1.percentage = 70.09;
		s1.college = "Sasi";
		System.out.println(s1);

		

		Branch b = new Branch();
		b.branch_id = 001;
		b.branch_name = "computer science and engineering";
		b.hodname = "Nagendranath";
		b.number_of_labs = 4;
		b.number_of_seats = 120;
		b.number_of_subjects = 48;
		b.number_of_semesters = 8;
		b.number_of_sections = 2;
		b.fees = 850000;
		b.passpercentage = 60.90;
		System.out.println(b);

		Human h = new Human();
		h.eyes = 2;
		h.ears = 2;
		h.hands = 2;
		h.legs = 2;
		h.liters_of_blood = 5;
		h.bmr = 1000.65;
		h.largestorgan = "skin";
		System.out.println(h);

		Employee e = new Employee();
		e.id = 7700;
		e.name = "Deepika";
		e.role = "QA";
		e.ann_highest_sal_inlakhs = 34.89;
		e.ann_lowest_sal_inlakhs = 1.5;
		e.ann_leaves = 30;
		e.permanent = true;
		e.location = "HYD";
		e.wrknghrs = 9;
		System.out.println(e);

		House o = new House();
		o.no_sq_feet = 225.25;
		o.no_of_rooms = 4;
		o.no_of_bedrooms = 2;
		o.hall_width = 121.67;
		o.kitchen_width = 180.56;
		o.no_of_floors = 2;
		o.face_of_entrance = "west";
		o.own = true;
		System.out.println(o);

		College c = new College();
		c.id = 6;
		c.location = "Tadepalligudem";
		c.name = "Sasi";
		c.no_of_blocks = 8;
		c.no_of_branches = 6;
		c.EAMCET_code = "site";
		System.out.println(c);

		States st = new States();
		st.name = "Andhrapradesh";
		st.sqkm = 16205;
		st.population_in_crores = 4.94;
		st.districts = 13;
		st.agrland = 22258;
		st.rivers = 40;
		System.out.println(st);

		Designation d = new Designation();
		d.id = 70;
		d.max_sal = 5.8;
		d.min_sal = 2.5;
		d.band = 'A';
		d.name = "Sr.Associate";
		d.responsibilty = "quality assurance and audits";
		System.out.println(d);

		Room r = new Room();
		r.name = "hall";
		r.sqft = 35.5;
		r.cupboards = 2;
		r.doors = 5;
		r.fans = 2;
		r.windows = 2;
		System.out.println(r);

		District dt = new District();
		dt.name = "Westgodavari";
		dt.population_in_lakhs = 4;
		dt.agrland_in_sqkm = 5023;
		dt.mandals = 48;
		dt.rivers = 5;
		dt.sqkm = 7742;
		System.out.println(d);
	}

}
