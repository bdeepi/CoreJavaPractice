package oOps_GettersnSetters;

public class Main {
	public static void main(String[] args) {

		Student s = new Student();
		Branch cse = new Branch();
		s.setId(515);
		s.setName("Deepika");
		s.setGender("female");
		s.setSection('A');
		s.setBranch(cse);

		cse.setBid(100);
		cse.setBname("cse");

		System.out.println(s);
		Branch ece = new Branch();
		ece.setBid(200);
		ece.setBname("ece");
		Student s1 = new Student(515, "Deepika", "female", 'A', cse);
		System.out.println(s1);

		if (s.equals(s1)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		if (cse.equals(ece)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}

		Employee e = new Employee();
		Designation srassociate = new Designation("SrAssociate", 'A');
		e.setId(20044770);
		e.setName("Deepika");
		e.setLocation("Hyderabad");
		e.setPermanent(true);
		e.setDesignation(srassociate);

		Designation jrassociate = new Designation("jrass", 'A');
		Employee e1 = new Employee(20044770, "Deepika", "Hyderabad", true,
				jrassociate);
		System.out.println(e);
		System.out.println(e1);
		if (e.equals(e1)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		if (jrassociate.equals(srassociate)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}

		House h = new House();
		Room livingroom = new Room(12, 6);

		h.setHno("27-11-4");
		h.setNo_of_floors(2);
		h.setLocation("Tanuku");
		h.setOwn(true);
		h.setRoom(livingroom);
		// livingroom.setNorooms(12);
		// livingroom.setNodoors(6);
		House h1 = new House("27-11-4", 2, "Tanuku", true, livingroom);
		System.out.println(h);
		if (h.equals(h1)) {
			System.out.println("equals");
		} else {
			System.out.println("not equal");
		}

		Human hu = new Human();
		Sport sport = new Sport();
		hu.setName("Deepu");
		hu.setLocation("Tanuku");
		hu.setSport(sport);
		sport.SetId(101);
		sport.setSname("cricket");

		System.out.println(hu);
		Human hu1 = new Human("Deepu", "Tanuku", sport);
		if (hu.equals(hu1)) {
			System.out.println("equals");
		} else {
			System.out.println("not equals");
		}

		District district = new District("wdgt");
		District district1 = new District("wdgt");
		State st = new State("Ap", "India", district);
		State st1 = new State("Ap", "India", district);
		System.out.println(st);
		if (st.equals(st1)) {
			System.out.println("equals");
		} else {
			System.out.println("not equals");
		}
		if (district.equals(district1)) {
			System.out.println("equals");
		} else {
			System.out.println("not equals");
		}

		Airways airways = new Airways("aeroplane", "helicopter");
		Airways airways1 = new Airways("aeroplane", "helicopter");
		Vehicles v = new Vehicles("Car", "Scooty", "bike", airways);
		Vehicles v1= new Vehicles("Car", "Scooty", "bike", airways);
		if (airways.equals(airways1)) {
			System.out.println("equals");
		} else {
			System.out.println("not equals");
		}
		if (v.equals(v1)) {
			System.out.println("equals");
		} else {
			System.out.println("not equals");
		}
		System.out.println(v);

	}
}
