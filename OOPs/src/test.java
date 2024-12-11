public class test {
    public static void main(String[] args) {
        singleton obj1 = singleton.getInstance();
        singleton obj2 = singleton.getInstance();
        singleton obj3 = singleton.getInstance();
        singleton obj4 = singleton.getInstance();
        singleton obj5 = singleton.getInstance();
        singleton obj6 = singleton.getInstance();

        if(obj1 == obj2)
        {
            System.out.println("Both are equal with == operator");
        }
        if(obj1.equals(obj2)){
            System.out.println("Both the methods are equal with equals operator");
        }
    }
}
