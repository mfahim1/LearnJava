package basic;

// IDE Integrated Development Environment
// Eclipse and IntelliJ IDea

public class HelloWorld { //class Start point
	//curly braces

	// Class is a file where we can write code. Class is a blueprint of the object
	//In a class we can create Variable, Method, constructor
	//public is access modifier, class is the keyword, HelloWorld is class name
	//main method: Driver method or executable method
	
	static int number2=50;
	int number3=55;
	
	
	
	public static void main( String args []    ) {  //main method body startPoint
		//main method...name of the method is main. Main cannot be changed
		// public is the access modifier
		//static is the keyword
		//void is the nonwritten type
		//String is a non primitive data type which is a class
		//args is an argument
		// double forward slash makes it a single line comment
		// Multiple line commenting  CRTL /
		// Document commenting /* */ 

		//to print anything in the console
		System.out.println("We are learning Java"); 
		//double quotes makes it a string
		// ; to close the statement

		
		HelloWorld hw = new HelloWorld();
		System.out.println(hw.number3);
		
	} //main method body EndPoint
	
} //Class End point 
