import myUtil.CoffeeBag; 
//importing the class required to run this tester saved in a package I created
import java.util.Scanner; // import Scanner for users input
import javax.swing.*; // import the package class for JOptionPane

public class CoffeeBagTester {

	/** Patricia Organ - 01110489 - Assignment 6 Q2
	 *Write	a program that accepts the unit of weight of a bag of coffee in pounds
	 * and the number of bags sold and display the total price of the sale. 
	 * You are required to define and use a programmer-defined CoffeeBag class. 
	 * Include class constants for the price per pound and tax rate with the value of
	 *  €5.55 per pound and 10% respectively.

	 */
	public static void main(String[] args) {
		// declare variables for input and calculations
		double total, totalWTax,tax,perLb;
		int numBags, weight;
		
		//create an instance of CoffeeBag
		CoffeeBag cb = new CoffeeBag();
		
		//create Scanner object
		Scanner input = new Scanner(System.in);
		
		//initialize the values by calling the get methods of CoffeeBag object
		tax = cb.getTax();
		perLb = cb.getPerLb();
		
		
		//Ask user for 2 things, the weight of the bags and the number sold
		System.out.print("What is the weight of the bags in lbs? ");
		//try{
		weight = input.nextInt();
		/*} catch (InputMismatchException e){
			String value = JOptionPane.showInputDialog("Must be a whole number try again:");
			weight = Integer.parseInt(value);
		}*/
		
		System.out.print("What is the number of bags sold? ");
		numBags = input.nextInt();
		
		
			
		
		//calculate totals after receiving users input
		total = weight * numBags * perLb;
		totalWTax = total + total * tax;
		
		//display the results in console
		System.out.printf("Number of bags sold:   %d\n" +
				"Weight per bag:   %d \n" +
				"Price per pound:   €%.2f\n" +
				"Sales tax:   %.1f%%\n\n" +
				"Total price: €%.2f",numBags, weight, perLb, tax*100, totalWTax);
		
		input.close();// kill the instance of scanner

	}

}
