package basic;

public class LearnConcatenation {

	// Concatenation: Joining a variable with a string value...+ sign is
	// concatenation

	public static void main(String[] args) {

		String firstName = "James"; // local Variable
		String lastName = "William";

		System.out.println("My Name is " + firstName); // concatenation
		System.out.println("My First Name is " + firstName + "And my Last name is " + lastName); // concatenation with 2 variables

		LearnAccessModifier lam = new LearnAccessModifier();
		System.out.println(lam.contactNumber); //protected variable


	}
}