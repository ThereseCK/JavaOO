package therese_get;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    public Employee(String name){
        this.name = name;
    }
    public void employeeAge(int empAge){
        this.age = empAge;
    }
    public void emplyeedesignation(String empDesig){
        designation = empDesig;
    }
    public void emplyeeSalary(double empSalary){
        salary = empSalary;
    }

    public void printEmplyee(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("--------------------------");
    }
}
