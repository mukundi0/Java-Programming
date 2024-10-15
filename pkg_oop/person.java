package pkg_oop;

public class person {

	
		// TODO Auto-generated method stub
	    //1. Declare Attributes
	    private String name;
	    private char gender;
	    private int yob;

	    //2. Declare constructors

	    public person(String n) {
	        name = n;
	}
	    public person(String name, char gender, int yob){
	        this.name = name;
	        this.gender = gender;
	        this.yob = yob;
	    }
	    //3. Define set methods
	    public void setName(String name){
	        this.name = name;
	    }

	    public void setGender(char gender){
	        this.gender = gender;
	    }

	    public void setYob(int yob){
	        this.yob = yob;
	    }

	    //4. Define get methods
	    public void getName(String name){
	        this.name = name;
	    }

	    public void getGender(char gender){
	        this.gender = gender;
	    }

	    public void getYob(int yob){
	        this.yob = yob;
	    }

	    public int computeAge(){
	        int age;
	        age = 2024 - yob;
	        return age;
	    }

	    public void showDetails(){
	        //Print all attribute values
	        System.out.println("Name: "+name);
	        System.out.println("Gender: "+gender);
	        System.out.println("YoB: "+yob);

	    }
	

		
		

	

}
