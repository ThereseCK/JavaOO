package therese_get;

public class Dog extends Animal {

    public void move(){
        super.move();
        System.out.println("Hunder kan gå og løpe");
    }

    public void bark(){
        System.out.println("hunder kan bjeffe");
    }
}
