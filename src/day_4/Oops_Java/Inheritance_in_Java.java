package day_4.Oops_Java;

class Employee
{
    String name;
    double baseSalary;

    public Employee(String name, double baseSalary)
    {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary()
    {
        return baseSalary;
    }
}

class FullTimeEmployee extends Employee
{
    double bonus;
    public FullTimeEmployee(String name, double baseSalary, double bonus)
    {
        super(name, baseSalary);
        this.bonus = bonus;

    }
    public double calculateSalary()
    {
        return super.calculateSalary() + bonus;
    }
}

class PartTimeEmployee extends Employee
{
    int hoursWorked;
    int hourlyRate = 200;

    public PartTimeEmployee(String name,  int hoursWorked)
    {
        super(name, 0.0);
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateSalary()
    {
        return hoursWorked * hourlyRate;
    }
}

public class Inheritance_in_Java
{
    public static void main(String []args)
    {
        FullTimeEmployee FTE = new FullTimeEmployee("Rahul", 55000.0,5000.0);
        System.out.println("Name: "+ FTE.name);
        System.out.println("Total Salary: "+FTE.calculateSalary());

        PartTimeEmployee PTE = new PartTimeEmployee("Anjali",80);
        System.out.println("Name: "+ PTE.name);
        System.out.println("Total Salary: "+PTE.calculateSalary());
    }
}
