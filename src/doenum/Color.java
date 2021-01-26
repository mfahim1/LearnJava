package doenum;

public enum Color {
    //Class is a blueprint of object
    //Enum: The main objective of enum is to define our own data types (Enumerated Data types).

    RED,GREEN,BLUE,YELLOW; //Always Upper Case for eNum String Values
    String name="James";
    int age;

    public void tvDisplay(){
        System.out.println("This is a TV Display");

    }

    Color() {  //Default Constructor

    }

    Color(String name) {  //Parameterized Constructor
        this.name = name;
    }

    Color(int age) {
        this.age = age;
    }



}
