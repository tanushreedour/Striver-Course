package cloning.DeepCopy;

import java.util.Arrays;

public class Human_Deep implements Cloneable
{
    int age;
    String name;
    int[] arr;
    public Human_Deep(int age, String name)
    {
        this.age = age;
        this.name = name;
        this.arr = new int[]{12, 34, 56 ,34, 32, 2};
    }

    public Object clone() throws CloneNotSupportedException{

        // I want deep copy here
        Human_Deep twin = (Human_Deep) super.clone();
//        twin.arr = new int[twin.arr.length];
//        for(int i =0 ; i < twin.arr.length ; i++)
//        {
//            twin.arr[i] = this.arr[i];
//        }

        twin.arr = Arrays.copyOf(this.arr, this.arr.length);
        return twin;
    }

}
