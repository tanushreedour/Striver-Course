package Enumeration;

public class Main
{
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        Week()
        {
            System.out.println("Hello " + this);
        }

        public void hello(){
            System.out.println("Hello!!");
        }
    }

    public static void main(String[] args) {

        System.out.println("-----------------------------------------");

        Week day = Week.Friday;

        System.out.println("-----------------------------------------");

        day.hello();

        // valueof() just prints the constant value in enum
        System.out.println(Week.valueOf("Friday"));

        // ordinal() gives the index value of the constant in the enum.
        System.out.println(day.ordinal());

        for (Week i : Week.values()) {
            System.out.println(i);
        }

    }
}
