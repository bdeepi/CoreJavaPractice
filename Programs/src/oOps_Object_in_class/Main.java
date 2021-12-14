package oOps_Object_in_class;

public class Main {

	public static void main(String[] args) {
		Student s = new Student();
		Branch b = new Branch();
		s.id = 15;
		s.name = "deepika";
		s.gender = "female";
		s.college = "Sasi";
		s.br = b;
		b.branch_name = "cse";
		b.branch_id = 001;
		b.number_of_seats = 120;
		b.fees = 80000;
		System.out.println(s);
		
		Employee e = new Employee();
        Designation d = new Designation();
        e.id = 770;
        e.name = "Deepika";
        e.role = "QA";
        e.permanent = true;
        e.designation = d;
        d.id = 20044770;
        d.max_sal = 50000;
        d.min_sal = 20000;
        d.band = 'A';
        System.out.println(e);
        
        House h = new House();
        Room r = new Room();
        h.house_no = "27-11-4";
        h.no_of_floors = 2;
        h. own = true;
        h.room = r;
        r.no_of_windows = 6;
        r.no_of_doors = 5;
        System.out.println(h);
        
        College c = new College();
        State st = new State();
        c.college_name = "Sasi ";
        c.location = "Tadepalligudem ";
        c.state = st;
        st.statename = " Ap";
        	
        System.out.println(c);
        
	}

}
