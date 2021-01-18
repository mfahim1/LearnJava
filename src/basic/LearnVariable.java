package basic;

public class LearnVariable { // A Class can be defined as a template or blueprint

	// Variable is a container, we can keep anything there.
	// Variable Syntax to create variable--- DataType variableName = variableValue;

	// Global Variables/Instance Variables
	int a = 5;
	// int is DataType, a is variable name, 5 is the variableValue
	// left side has Variable Name (int a) and right side we have Variable Value (5)

	int b = 6; // hard code
	int c = a; // a = 5 ...c calls a which equals 5
	int d = b; // dynamic code

	// To Declare Variable see below.
	int age;

	// Declare and Initialize Value
	int salary = 5000;
	int augustSalary = 6000; // camelCase or snack_case

	// Types of Variables
	// Variable, Static, main method, methods all part of the class
	// Global Variable/Instance Variable: anyone can get access from any class.
	// There are 2 types of Global Variables: Non Static Global Variable & Static
	// Global Variable
	// Non Static Global Variable - called by Object Name
	int number = 50;

	// Static Global Variable
	static int quantity = 37; // static is a keyword
	static double length = 23.5;
	// Static Variable is called by class Name

	// Variable inside a class it is Global. Variable should have meaningful name
	// Local Variable: you only get access from that particular position.
	// create a Variable inside a method.

	// shortcut to create main, type main then CRTL Space Enter
	public static void main(String[] args) {

		// Local Variable, we dont need static or object to call it in the method
		int price = 30; 
		System.out.println(price);

		// Sysout CRTL SPACE to do SYstem.out.println
		System.out.println(LearnVariable.quantity); // quantity is the variable ClassName.Variable
		System.out.println(LearnVariable.length); // . we use to make a relationship
		System.out.println(length); // it will work but not best practice
		System.out.println(HelloWorld.number2); // calling variable from another class

		// Create an Object and then Call by object Name
		// Object is steps and behaviors, it is an instance of a class
		// Object is created from a Class
		// Syntax --- className objectName = new constructorOfClass();

		LearnVariable obj = new LearnVariable();
		System.out.println(obj.salary);
		// System.out.println(LearnVariable.salary);

		obj.display();
		
	}
	
	public void display() {
		int num= 33; //local variable
		System.out.println(num);
		
	
	}

}
