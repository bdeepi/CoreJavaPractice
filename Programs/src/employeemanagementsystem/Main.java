package employeemanagementsystem;



public class Main {
	public static void main(String[] args) {
		
		EmployeeBuilder eb = new EmployeeBuilder();
		
		
	Employee e1 = new Employee(1,"deepu");
	Employee e2 = new Employee(2,"sai");	
	Employee e3 = new Employee(3,"surya");
	Employee e4 = new Employee(4,"deep");
	
		eb.addEmployee(e1);
		eb.addEmployee(e2);
		eb.addEmployee(e3);
		eb.addEmployee(e4);
		eb.printAllEmployees();
		System.out.println(eb.getEmployee(e1.getId()));
	}



		

	}


