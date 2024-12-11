// A static class can only contain static methods, variables, and nested classes.
// Static classes cannot be instantiated, so you cannot create objects of a static class.
// You can only access the members of a static class using the class name itself.
// Static classes are often used to group related utility methods together.
// The Math class in Java is an example of a static class.



public class check
{

    public static void main(String[] args) {
        Tanu n = new Tanu("Jaya");
        Tanu p = new Tanu("Rahul");

        System.out.println(n.name);
        System.out.println(p.name);

        System.out.println(n);
        System.out.println(p);
    }

}
 class Tanu{
    String name;
    Tanu(String name)
    {
        this.name = name;
    }

     @Override
     public String toString() {
         return name;
     }
 }
