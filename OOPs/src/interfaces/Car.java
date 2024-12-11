package interfaces;

public interface Car {
    // Variables by default are static and final in Interfaces
    // final variables must be initalized.
    // That's why, it's giving an error, we have to initialize the variable because it is final.

    int age = 20;                      // final
    String name = "Tanushree Dour";     // final

    // static methods cannot be inherited
    // static methods are not overridden

    // Because overriding depends on object, it is the case of runtime polymorphism and static
    // methods are not dependent on objects. Hence, they cannot be overridden and cannot be inherited
    // and therefore they have to be defined in the interface itself and they are the unique methods
    // of interface. We have to call these methods via that interface only.
    static void Print()
    {
        System.out.println("Good morning, I'm Tanushree, nice to meet you!");
    }
}
