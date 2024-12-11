package cloning.DeepCopy;

import java.util.Arrays;

public class Source {

    public static void main(String[] args) throws CloneNotSupportedException
    {
        Human_Deep tanu = new Human_Deep(20, "Tanushree");

        Human_Deep avani = (Human_Deep) tanu.clone();

        System.out.println(Arrays.toString(tanu.arr));

        avani.arr[0] = 100;

        System.out.println(Arrays.toString(avani.arr));
        System.out.println(Arrays.toString(tanu.arr));

    }
}
