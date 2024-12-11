import java.util.*;

class Animal
{
    public void eat()
    {
        System.out.println("Animal are eating.");
    }
}
class Cat extends  Animal{
    public void eat()
    {
        System.out.println("Cat is eating");
    }
}

public class Test
{
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();
        Cat c = (Cat)a;
        c.eat();
    }
}
