package therese_get;

public class Puppy {
    int puppyAge;

        public Puppy() {
    }
    public Puppy(String name){
        System.out.println("Puppy's name is : " + name);
    }
    public void setAge(int age){
            puppyAge = age;
    }
    public void getAge(){
        System.out.println("Puppy's age is: " + puppyAge);
    }

}
