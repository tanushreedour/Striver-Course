package LL_tutorial.SinglyLL;

import java.util.LinkedList;

import LL_tutorial.Middle.Node;

public class Main {
    public static void main(String[] args)
    {
        linkedList list = new linkedList();

//        list.insertAtBeginning(23);
//        list.insertAtBeginning(34);
//        list.insertAtBeginning(43);
//        list.insertAtBeginning(12);
//        list.insertAtBeginning(87);
//        list.insertAtBeginning(100);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        list.display();

        list.addAt(100, 4);
        System.out.println("------------------------------------------------------");
        list.display();


        list.DeleteFirst();
        list.display();


        list.DeleteLast();
        list.display();

        list.deleteAt(4);
        list.display();

        System.out.println(list.findNode(100));

        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------------");
        list.InsertRec(87, 3, list.getHead());
        list.display();



        // Second linked list
        linkedList list2 = new linkedList();
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(2);
        list2.add(2);
        list2.add(3);
        list2.add(3);
        list2.add(3);
        list2.add(4);

        list2.removeDuplicates();
        list2.display();
        System.out.println(list2.getSize());

        linkedList list3 = new linkedList();
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(5);
        list3.add(7);
        list3.add(9);
        list3.add(6);
        list3.add(4);
        list3.add(1);
        list3.add(8);

        list3.deleteFromLast(4);
        list3.display();

//        linkedList.Node node = list.findMiddle();
//        System.out.println(node.data);
//        LinkedList<Integer> list2= new LinkedList<>();
//        list2.add(34);
//        list2.add(56);
//        System.out.println(list2);
//        list.size();
    }

}
