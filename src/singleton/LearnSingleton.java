package singleton;

import basic.LearnNestedClass;

public class LearnSingleton {
    //Singleton Class: we are allowed to create one instance of a class at a time
    //Using Private constructor we can ensure that no more than one object can be created at a time

    String collegeName="Queens College";

    private LearnSingleton(){ //Default Constructor,can access in same class

    }

    public static LearnSingleton instance=new LearnSingleton(); //created an instance variable or object inside class

    public static LearnSingleton getInstance(){ //Return type Method, returns class LearnSinglton
        return instance;
    }

    public static void main(String[] args) {
        LearnSingleton les=new LearnSingleton();

    }
}
