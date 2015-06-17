package Person;

public class PersonTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// create 2 instances of the class Person
		//use the construct that passes values
		Person p1 = new Person("John", 22, 'M');
		//use the construct that does not pass any values
		Person p2 = new Person();
		
		//print out using the get methods from the Class Person for p1
		System.out.println("Person 1's name is " + p1.getName() 
				+ " and age is " + p1.getAge() 
				+ " and gender is " +  p1.getGender());
		//print out using the get methods from the Class Person what values had been 
		//assigned to person2 when no values were sent
		System.out.println("Person 2's name is " + p2.getName() 
				+ " and age is " + p2.getAge() 
				+ " and gender is " +  p2.getGender());
		
		//incorrect way is access the variable direct with dot operator
		 //delete lines 28-34 to have the code work with private variables in Person Class
		p2.name = "PublicTester";
		p2.age = 50;
		p2.gender = 'F';
		
		System.out.println("Person 2's name is " + p2.name 
				+ " and age is " + p2.age 
				+ " and gender is " +  p2.gender);
		/*
		when Class variables are private this will produce the below error and will not run
				Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
				The field Person.name is not visible
				The field Person.age is not visible
				The field Person.gender is not visible

				at Person.PersonTester.main(PersonTester.java:22)
		
		if the Person class is updated as below to have public variables, then the line numbers 28-34 will successfully run
		public String name; // The name of this person
		public int age; // The age of this person
		public char gender; // The gender of this person
		
		gives output when set to public:
		Person 2's name is PublicTester and age is 50 and gender is F
		*/
		
		//correct way is to use the set methods of the person class	
		//(but will also work if either private or public variables in Person Class are set)
		p2.setName("Susan");
		p2.setAge(25);
		p2.setGender('F');
	
		//Gives output when done correctly: 
		//Person 2's name is Susan and age is 25 and gender is F
		System.out.println("Person 2's name is " + p2.getName() 
				+ " and age is " + p2.getAge() 
				+ " and gender is " +  p2.getGender());
		
		

	}

}
