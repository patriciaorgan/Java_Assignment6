import myUtil.Person;

public class PersonTestPrivate {

	/** Patricia Organ - 01110489 - Assignment 6 Q1
	 * Write a program to test the Person class defined below.  
	 * Your test program should create two instances of the class 
	 * (each to test a different constructor) and test each of the methods.  
	 * You are also required to illustrate the error in trying to access private
	 *  data members from the client class (for clarity temporarily change the 
	 *  private modifier to public and test again).  
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
		
		//incorrect way is to access the class variables direct with dot operator
		//in order to actually run successfully will have to comment out this code
		p2.name = "PrivateTester";
		p2.age = 50;
		p2.gender = 'F';
		
		System.out.println("Person 2's name is " + p2.name 
				+ " and age is " + p2.age 
				+ " and gender is " +  p2.gender);
		//*/
		
		/*
		when Class variables are private this will produce the below error and WILL NOT RUN
				Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
				The field Person.name is not visible
				The field Person.age is not visible
				The field Person.gender is not visible

				at Person.PersonTester.main(PersonTester.java:22)
		*/
		
		//correct way is to use the set methods of the person class	
		//(but will also work if either private or public variables in Person Class are set)
		p2.setName("Susan");
		p2.setAge(25);
		p2.setGender('F');
			
		System.out.println("Person 2's name is " + p2.getName() 
						+ " and age is " + p2.getAge() 
						+ " and gender is " +  p2.getGender());

	}

}
