package oop.inheritance;

public class Daughter extends Father{

    //Variable
    public String favoriteDish="Fish";
    public String favoriteSport="Volleyball";
    public String daughterSSN="09941312";

    private String daughterAccountNumber;

    public Daughter(){ //Default Constructor

    }
    public Daughter(String favoriteDish){ //Parameterized Default Constructor
        this.favoriteDish=favoriteDish;
        System.out.println("Daughter Favorite Dish is "+favoriteDish);
    }

    public Daughter(String favoriteDish, String favoriteSport){ //Parameterized Default Constructor
        this.favoriteDish=favoriteDish;
        this.favoriteSport=favoriteSport;
        System.out.println("Daughter Favorite Dish is "+favoriteDish + "Sport is "+favoriteSport);
    }

    public String getDaughterAccountNumber() {
        return daughterAccountNumber;
    }

    public void setDaughterAccountNumber(String daughterAccountNumber) {
        this.daughterAccountNumber = daughterAccountNumber;
    }

    //Methods
    public void musician(){
        System.out.println("Daughter is a musician");
    }

    public void honest(){
        System.out.println("Daughter is honest");
    }

    public void model(){
        System.out.println("Daughter is a model");
    }

    public void gym(){
        System.out.println("Daughter goes to the gym and does yoga");
    }



}
