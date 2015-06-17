import myUtil.Person; // import the Person class in my own created package myUtil

public class PersonTestPublic {

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
		//use the constructor that passes values
		Person p1 = new Person("John", 22, 'M');
		//use the construct that does not pass any values
		Person p2 = new Person();
		
		//print out using the get methods from the Class Person for p1
		System.out.println("Person 1's name is " + p1.getName() 
				+ " and age is " + p1.getAge() 
				+ " and gender is " +  p1.getGender());
		
		//print out using the get methods from the Class Person what values had been 
		//assigned to p2 when no values were sent, results in the values that we set in the 
		//constructor when no values were passed it called the constructor with the 'this' command 
		//and did pass values and these are the ones outputted below
		System.out.println("Person 2's name is " + p2.getName() 
				+ " and age is " + p2.getAge() 
				+ " and gender is " +  p2.getGender());
		
		//incorrect way is access the variable direct with dot operator
		p2.name = "PublicTester";
		p2.age = 50;
		p2.gender = 'F';
		
		System.out.println("Person 2's name is " + p2.name 
				+ " and age is " + p2.age 
				+ " and gender is " +  p2.gender);
		/*
		if the Person class is updated as below to have public variables, 
		then the line numbers 35-41 will successfully run
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
