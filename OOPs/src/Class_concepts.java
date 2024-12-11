public class Class_concepts {
    public static void main(String[] args) {
        final A a = new A("Tanu");

        // We cannot change final objects. Instead we can change the values of that object.
        a.name = " Anushka";
//         a = new A("He");
        System.out.println(a.name);
    }
}
class A {
    String name;
    A(String name)
    {
        this.name = name;
    }
}
