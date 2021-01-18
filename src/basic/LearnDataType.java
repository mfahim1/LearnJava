package basic;

public class LearnDataType {

	//Data Types
		//Primitive Data Type
			//numeric (integer (byte, short, int, long), floating point), non-numeric (character, boolean)
		//NonPrimitive Data Type
			//String, Array...., user defined classes
	
	byte qty=23; //byte is data type, qty is variable name, 23 is variable value
	short number = 3435;
	long transactionNumber= 2309419l; //you have to mention l in the end
	int age = 24;
	
	float salary= 34550.2288f; //you have to mention f in the end
	double yearlySalary = 120000.1234; //Will take decimal values. Float is also decimal but needs f at the end
	
	boolean isAvailable = true; //will take true or false
	char pizzaSize = 'L'; //Value will be in single quote with 1 character


	String firstName= "James"; //Anything you write inside double quote is called a string
	
	public static void main(String[] args) {
		
		//Create object
		LearnDataType ldt=new LearnDataType();
		System.out.println(ldt.salary);
		System.out.println(ldt.age);
		System.out.println(ldt.pizzaSize);
		System.out.println(ldt.transactionNumber);
		System.out.println(ldt.yearlySalary);
		System.out.println(ldt.qty);
		
	}
		
}
