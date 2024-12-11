package LL_tutorial.DoublyLinkedList;



public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.addAtEnd(5);
        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.addAtEnd(40);

        list.InsertFirst(2);
        list.addAtEnd(98);
        list.add(34);
        list.InsertFirst(10);
        list.InsertFirst(20);
        list.InsertFirst(30);
        list.add(10);


        list.insertAt(16, 1);
        list.insertAt(18, 2);
        list.insertAt(12, 4);
//        list.insertAt(90, -5);

        list.display();

        list.DeleteFirst();

        System.out.println("\n---------------------After deletion : ---------------------------");

        list.deleteLast();
        list.deleteNode(5);
        list.deleteNode2(13);

        System.out.println("Node number : " + list.find(30));
        System.out.println("Size : " + list.getSize());

        list.display();

    }
}
