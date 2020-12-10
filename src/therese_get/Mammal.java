package therese_get;

public class Mammal implements IAnimal{

    public void eat(){
        System.out.println("Mammal eats");
    }

    public void travel() {
        System.out.println("Mammal travels");
    }

    public int noOfLegs(){
        return 2;
    }



}
