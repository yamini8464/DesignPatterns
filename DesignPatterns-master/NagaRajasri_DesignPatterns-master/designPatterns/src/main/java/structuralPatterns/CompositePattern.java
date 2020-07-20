package structuralPatterns;

public class CompositePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee chairman = new Employee(101, "Vishnu","CHAIRMAN");
		Employee viceChairman = new Employee(102, "Raju", "Vice-chairman");
		Employee principal = new Employee(103, "Srinivas","Principal");
		Employee vicePrincipal = new Employee(104,"SrinivasaRaju","VicePrincipal");
		Employee cseHod = new Employee(105, "Purushotham","CSE_HOD");
		Employee eceHod = new Employee(106, "Ramu","ECE_HOD");
		Employee cseFaculty1 = new Employee(107,"Mohan","faculty");
		Employee cseFaculty2 = new Employee(108,"Ramesh","faculty");
		Employee eceFaculty1 = new Employee(109, "Raj","faculty");
		Employee eceFaculty2 = new Employee(110, "Krishna","faculty");
		chairman.add(viceChairman);
		chairman.add(principal);
		chairman.add(vicePrincipal);
		principal.add(cseHod);
		principal.add(eceHod);
		cseHod.add(cseFaculty1);
		cseHod.add(cseFaculty2);
		eceHod.add(eceFaculty1);
		eceHod.add(eceFaculty2);
		//chairman of organization
		System.out.println("Chairman of organization");
		System.out.println(chairman);
		System.out.println("Head of organization");
		for(Employee headEmployee : chairman.getSubordinates())
			System.out.println(headEmployee);
		System.out.println("Head of Departments");
		for(Employee hod : principal.getSubordinates())
			System.out.println(hod);
		System.out.println("Faculty of CSE department");
		for(Employee faculty : cseHod.getSubordinates())
			System.out.println(faculty);
		System.out.println("Faculty of ECE department");
		for(Employee faculty : eceHod.getSubordinates())
			System.out.println(faculty);
	}

}
