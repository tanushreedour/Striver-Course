package LL_tutorial.CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.delete(3);
        list.display();
        System.out.println("\nTotal number of nodes in linked list : " + list.size);
    }
}
