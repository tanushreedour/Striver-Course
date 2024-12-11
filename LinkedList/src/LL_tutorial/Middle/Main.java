package LL_tutorial.Middle;

import java.util.Collections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//
//        MiddleLL list2 = new MiddleLL();
//
//        Node node = list2.findMiddle();
//        System.out.println(node.data);

        ArrayList<Integer> check = new ArrayList<>();
        check.add(12);
        check.add(34);
        check.add(78);
        check.add(34);
        check.add(54);

        Collections.sort(check);
        System.out.println(check);
    }
}
