package constructor;

public class LearnConstructor {
    //Constructor
    //Constructor name should be same name as class
    //Constructor has no return type
    //Constructors are used to initialize object
    //AccessModifier className (){  }
    //A constructor in Java is a special method that is used to initialize objects.

    String name; //Declared a variable
    String address;
    String contactNumber;

    public LearnConstructor(){
        //Default constructor: without parameter/signature
        System.out.println("Hello");
    }

    public LearnConstructor(String name){ //String name is a Local Variable because its inside of a Constructor
                                    //String is data type, name is variable name
        // Single (as we are creating 1 parameter) Parameterized Constructor
        // Add Signature/Pattern/Parameter. String name is the Constructor Signature
        // Types of Variables: Global(outside a method/constructor, inside a class) and Local
        //Anything inside parenthesis is a parameter
        this.name   =  name; //This will show any global variable. this.name is the variable, name is the variable name
        //We can't call by class name because its not static
        //For non static variables we can call using this keyword
        System.out.println(this.name);
    }

    public LearnConstructor(String name, int num1){ //Double/Multi Parameterized constructor, we can create unlimited
        int number1=num1;
        this.name=name;
        System.out.println("My Name is "+this.name+" "+ "My Age is "+number1);
    }

    public LearnConstructor(String name, String address){
        this.name=name;
        this.address=address;
        System.out.println("My Name is "+this.name+" "+"Address is "+this.address);
    }

    public LearnConstructor(String name, String address, String contactNumber){ //pattern of signature must be different
        this.name=name;
        this.address=address;
        this.contactNumber=contactNumber;
        System.out.println("My Name is "+this.name+" "+"Address is "+this.address+" "+"My Contact Number is "+this.contactNumber);
    }

    int num3=33; //Global Variable as its outside a class

    public void display(){
        int number=40;  //local variable because its inside a method
    }


    public static void main(    String[] args   ) {  //String[](Data Type) args(name of Array) is a parameter
        //object
        LearnConstructor lc = new LearnConstructor(); //will print hello
        //when creating object, constructor is called or used

        int num=20; //local variable
        int num1=30;

        //Can we create multiple Objects of same class? Yes
        LearnConstructor obj= new LearnConstructor("James"); //argument passing inside parameter

        LearnConstructor jack=new LearnConstructor("Jack",24);

        LearnConstructor runa=new LearnConstructor("Parvin","Queens, NY");

        LearnConstructor cont=new LearnConstructor("Muhammad","Buffalo, NY","7187777777");

    }
}
