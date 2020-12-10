package therese_get;

public class Ansatt {
    private String name;
    private String address;
    private int number;

    public Ansatt(String name, String address, int number){
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public void mailCheck(){
        System.out.println("Poster en sjekk til : " + this.name + " " + this.address);
    }
    public String toString(){
        return "\n" + name + ", \nadresse: " + address + ", \ntlf: " + number;
    }
    public void setAddress(String newAdress){
        address = newAdress;
    }

}
