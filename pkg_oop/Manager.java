package pkg_oop;

public class Manager extends Employee {
	
	private double salary;
	
	public Manager(String name, int yob, char gender, String job_title, double salary) {
		super(name, yob, gender, job_title);
		this.salary = salary;
	}
	
	@Override
	public void showDetails() {
		System.out.println("Salary: "+salary);
	}
	

}
