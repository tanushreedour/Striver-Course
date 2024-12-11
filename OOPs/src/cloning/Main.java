package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human tanu = new Human(20, "Tanu");
//        System.out.println(tanu.age);
//        System.out.println(tanu.name);

        Human naman = (Human) tanu.clone();
//        System.out.println(naman.name);
//        System.out.println(naman.age);

        naman.age = 22;
        // Primitives value will not change
        System.out.println(tanu.age);

        // But in case of non primitives, value of original object will change
        // because clone() will do shallow copy.

        System.out.println("Tanu object array : "+Arrays.toString(tanu.arr));

        naman.arr[0] = 100;

        System.out.println("------------Change-----------");
        System.out.println("Naman's array : " + Arrays.toString(naman.arr));
        System.out.println("Tanu's array : "+ Arrays.toString(tanu.arr));

        // String is non-primitive but Strings are immutable in Java, that's why, the string
        // remains same even the clone() function is doing shallow copy and the clone is pointing
        // to the original String.
        naman.name = "Naman Mishra";
        System.out.println(tanu.name);
    }
}
