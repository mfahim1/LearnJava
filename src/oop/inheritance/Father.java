package oop.inheritance;

public class Father extends GrandFather{  //single level inheritance

    //Variable
    public String favoriteDish="Beef";
    public String favoriteSport="Basketball";
    public String fatherSSN="990909900";

    private String fatherAccountNumber;

    public Father(){ //Default Constructor

    }
    public Father(String favoriteDish){ //Parameterized Default Constructor
        this.favoriteDish=favoriteDish;
        System.out.println("Fathers Favorite Dish is "+favoriteDish);
    }

    public Father(String favoriteDish, String favoriteSport){ //Parameterized Default Constructor
        this.favoriteDish=favoriteDish;
        this.favoriteSport=favoriteSport;
        System.out.println("Fathers Favorite Dish is "+favoriteDish + "Sport is "+favoriteSport);
    }

    public String getFatherAccountNumber() {
        return fatherAccountNumber;
    }

    public void setFatherAccountNumber(String fatherAccountNumber) {
        this.fatherAccountNumber = fatherAccountNumber;
    }

    //Methods
    public void swim(){
        System.out.println("Father can swim");
    }

    public void beard(){
        System.out.println("Father has beard");
    }

    public void hairColor(){
        System.out.println("Father hair color is black");
    }

    public void eyes(){
        System.out.println("Father has blue eyes");
    }

}
