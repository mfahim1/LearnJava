package oop.inheritance;

public class GrandFather {

    //Variable
    public String favoriteDish="Salmon";
    public String favoriteSport="football";
    public String grandFatherSSN="102934849";

    private String accountNumber;

    public GrandFather(){ //Default Constructor

    }
    public GrandFather(String favoriteDish){ //Parameterized Constructor
        this.favoriteDish=favoriteDish;
        System.out.println("Grand Fathers Favorite Dish is "+favoriteDish);
    }

    public GrandFather(String favoriteDish, String favoriteSport){ //Parameterized Constructor
        this.favoriteDish=favoriteDish;
        this.favoriteSport=favoriteSport;
        System.out.println("Grand Fathers Favorite Dish is "+favoriteDish + "Sport is "+favoriteSport);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    //Methods
    public void height(){
        System.out.println("Grand Father Height is 6.2");
    }

    public void weight(){
        System.out.println("Grand Father Height is 152");
    }

    public void jump(){
        System.out.println("Grand Father can jump");
    }

    public void playGame(){
        System.out.println("Grand Father can play football");
    }



}
