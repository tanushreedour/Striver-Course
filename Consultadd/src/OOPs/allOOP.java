package OOPs;

// Abstraction
abstract class person
{
    private String name;
    private int age;

    // Constructor overloading (Polymorphism)
    public person()
    {
        this.name = "unknown";
        this.age = 0;
    }

    public person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    //Encapsulation
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return this.age;
    }

    public abstract void getDetails();
}

// Encapsulation
class Employee extends person    //Inheritance
{
    private double salary;
    private String dept;


    Employee(String name, int age, double salary, String dept)
    {
        super(name, age);
        this.salary = salary;
        this.dept = dept;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    public double getSalary()
    {
        return this.salary;
    }
    public void setDept(String dept)
    {
        this.dept = dept;
    }
    public String getDept()
    {
        return this.dept;
    }
    @Override //Polymorphism
    public void getDetails()
    {
        System.out.println("Name : " + getName() + ", Age : " + getAge() + ", Salary : " + getSalary() + ", Department : " + getDept());
    }
}
public class allOOP
{
    public static void main(String[] args)
    {
        Employee emp1 = new Employee("Tanu", 20, 233561.90, "IT");
        Employee emp2 = new Employee("Neha", 23, 35253, "Sales");

        person p = emp1;

        emp2.getDetails();
        emp1.getDetails();
        p.getDetails();
    }
}
