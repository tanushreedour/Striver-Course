package cloning;

public class Human implements Cloneable
{
    int age;
    String name;
    int[] arr;
    public Human(int age, String name)
    {
        this.age = age;
        this.name = name;
        this.arr = new int[]{12, 34, 56 ,34, 32, 2};
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();

        // This will create shallow copy of an array
        // This is somewhat like:

//        Human human = (Human) super.clone();
    }

}
