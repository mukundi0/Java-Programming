package pkg_oop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person obj1 = new person("Alex");
		person obj2 = new person ("Jane", 'F', 2004);
		Employee obj3 = new Employee("Jackie", 1992 , 'F', "Senior" );
		Manager obj4 = new Manager("Mike", 1786, 'M', "Associate", 10000);
		
		 //Use set method to assign values
        obj1.setYob(2000);
        obj1.setGender('M');

        //Use get methods to retrieve values
        obj1.showDetails();
        System.out.println("\n");
        obj2.showDetails();
        System.out.println("\n");
        obj3.showDetails();
        System.out.println("\n");
        obj4.showDetails();

	}

}
