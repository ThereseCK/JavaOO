package therese_get;

public class Main {

    public static void main(String[] args) {
	// write your code here
//----------------Hører til Puppy klassen-------------------------
        //objekt laging
        Puppy myPuppy = new Puppy("Therese");

        // kalle klasse-metode for å sette alder
        myPuppy.setAge(1);

        //kaller en annen klasse-metode for å hente alderen
        myPuppy.getAge();

        //en annen måte å hente valpen sin alder
        System.out.println("Puppy's age version 2:  " + myPuppy.puppyAge);
//------------------------ hører til emplyee klassen --------------
        Employee emp1 = new Employee("Therese Kjær");
        Employee emp2 = new Employee("Henning Kjær");

        emp1.employeeAge(30);
        emp1.emplyeedesignation("programming Teacher");
        emp1.emplyeeSalary(350);
        emp1.printEmplyee();

        emp2.employeeAge(30);
        emp2.emplyeedesignation("Programming Student");
        emp2.emplyeeSalary(400);
        emp2.printEmplyee();
//---------------------Hører til calculation klassene med arv ----------------
        int a = 20, b = 10;
        My_Calculation demo = new My_Calculation();
        demo.addition(a, b);
        demo.Substraction(a, b);
        demo.multiplication(a, b);

//--------------------- Hører til Super og Sub klassene --------
        System.out.println("---------------------------------------");
        Subclass obj = new Subclass();
        obj.myMethod();

//----------------------Hører til animals og dog klasser------------------
        System.out.println("---------------------------------------");
        Animal bb = new Dog();
        bb.move();

//----------------------Hører til lønn og ansatt klassen------------------
        System.out.println("---------------------------------------");
        Lønn s = new Lønn("therese Kjær", "larvik, Norde", 1234567, 350.000 );
        Ansatt e = new Lønn("Henning Kjær", "Lavrik, Norge", 7654321, 400.000);

        s.mailCheck();
        s.setAddress("Stavern, Norge");
        System.out.println("-------------------etter flytting -------------------");
        s.mailCheck();
        e.mailCheck();

        //----------------------Hører til Encaptest klassen------------------
        System.out.println("---------------------------------------");
        Encaptest encap = new Encaptest();
        encap.setName("Therese");
        encap.setAge(30);
        encap.setIdNum("12hallo");
        System.out.println("Navn: " + encap.getName() + " Alder: " + encap.getAge() + " Id " + encap.getIdNum());
        //----------------------Hører til IAnimal interface------------------
        System.out.println("---------------------------------------");
        Mammal m = new Mammal();
        m.eat();
        m.travel();

    }
}
