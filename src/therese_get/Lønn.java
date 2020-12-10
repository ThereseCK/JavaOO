package therese_get;

public class Lønn extends Ansatt {
    private double lønn;

        public Lønn(String name, String address, int number, double lønn) {
        super(name, address, number);
        setSalary(lønn);
    }

    public void mailCheck(){
        System.out.println("Poster sjekk til: " + toString() +
                "\nmed årslønn på: " + lønn + "\nmånedslønn er : " + lønn/12 + "\n");
    }

    private void setSalary(double nylønn) {
            if(nylønn > 0.0){
                lønn = nylønn;
            }

    }


}
