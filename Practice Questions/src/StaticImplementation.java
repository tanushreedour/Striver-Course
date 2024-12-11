public class StaticImplementation
{
    // static is used in public static void main because  keyword static allows main to be called without creating
    // an object of the class in which the main method is defined.

    public static void main(String[] args) {
        int n = 2345687;
        System.out.println(CountNumbers(n));
    }
    static int count = 0;

    // A static method can access only static variables and static methods of another class or same class.

    // A non-static method can access static as well as non-static variables and methods of a class.

    // static variables are members of  a class.

    // static variables are shared between all the objects of that class.

    // static member is common for all the objects of a class.

    // static variables are created only once in a program lifetime.

    // We can change the value of static but the change will be reflected for all the objects.

    // static members can be accessed via class name directly as they are member of a class.
     static int CountNumbers(int n){
        if(n > 0){
            count++;
            CountNumbers(n/10);
        }
         return count;
    }
}
