package pkg_oop;

public class Employee extends person {
	
	private String job_title;
	//1. constructors are NEVER inherited
	
	public Employee(String name, int yob, char gender, String job_title) {
//		//1st approach - use SetMethods
//		//super is a keyword used to access public/protected
//		super(name);//Parent constructor
//		super.setGender(gender);
		
		// 2nd approach - use constructor that initializes all attributes
		super(name, gender, yob);
		this.job_title = job_title;
	}
	//polymorphism - we want showDetails to additionally
	//print 'job_title'
	
	@Override
	public void showDetails() {
		System.out.println("Job Title: "+job_title);
	}
	
}
