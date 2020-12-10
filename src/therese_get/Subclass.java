package therese_get;

public class Subclass extends Superclass{
    int num = 10;

    public void display(){
        System.out.println("dette er visningen for metoden subclass");
    }

    public void myMethod(){
        Subclass sub = new Subclass();
        sub.display();
        super.display();

        System.out.println("verdien av variablen i subclass " + sub.num);
        System.out.println("verdien av variablen i superclass " + super.num);
    }

}
