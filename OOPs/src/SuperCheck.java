 class Parent
{
    int weight;
    int height;
    int length;
    int width;

    Parent()
    {
        height = 9;
        length = 9;
        width = 6;
        System.out.println("Hello");
    }

    Parent(int l, int h, int w)
    {
        this.length = l;
        this.height = h;
        this.width = w;
    }
}


class child extends Parent{
    int count;
    child()
    {
        super();
        int count = 0;
        System.out.println("See you soon!");
    }
    child(int height, int width, int count)
    {
        this.count = count;
        this.height = height;
        this.width = width;
        this.length = length;
    }
}


public class SuperCheck{
    public static void main(String[] args) {

        child c = new child();


        Parent p = new child(23, 45, 67);
        System.out.println(p.width);
        System.out.println(p.length);

//        We cannot create Parent object with Child class reference.
//        child c = (child)new Parent();
//        System.out.println(c.count);
//        System.out.println(c.length);
    }
}