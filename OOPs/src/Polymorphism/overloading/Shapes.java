package Polymorphism.overloading;

public class Shapes {
    int height;
    int breadth;
    int length;
    Shapes()
    {
        System.out.println("Hi, Do you wanna deep dive into shapes?");
    }
    Shapes(int height, int width, int length)
    {
        this.height = height;
        this.breadth= width;
        this.length = length;
    }

    Shapes(int l)
    {
        this.length = l;
    }

    static void greeting()
    {
        System.out.println("I'm in Shapes class. Greetings!");
    }
}
