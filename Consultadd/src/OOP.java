abstract class Person
{
    private String name;
    private int age;

    public Person()
    {
        this.name = "unknown";
        this.age = 0;
    }
    public Person(String name)
    {
        this.name = name;
    }
    public Person(int age)
    {
        this.age = age;
    }
    public Person(String name, int age)
    {
        this(name);
        this.age = age;
    }
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
        return age;
    }
    public abstract void showDetails();
}
class Employee extends Person{
    private double salary;
    private String dept;

    public Employee()
    {
        this.salary = 0.0d;
        this.dept = "null";
    }
    public Employee(String dept, double salary)
    {
        this.dept = dept;
        this.salary = salary;
    }

    public Employee(String name, int age, String dept, double salary)
    {
        super(name, age);
        this.dept = dept;
        this.salary = salary;
    }
    public void getDept(String dept)
    {
        this.dept = dept;
    }
    public String getDept()
    {
        return this.dept;
    }
    public void setSalary(double salary)
    {
        this.salary= salary;
    }
    public double getSalary()
    {
        return this.salary;
    }
    public void showDetails()
    {
        System.out.println("Name: "+getName()+", Age: "+getAge()+", Department: "+getDept()+", Salary: "+getSalary());
    }
}
public class OOP {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Tanushree Dour", 20, "CSE", 123441.1341);
        emp1.showDetails();
    }
}
