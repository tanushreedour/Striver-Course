package LL_tutorial.Sorting;
import LL_tutorial.Middle.Node;
import LL_tutorial.SinglyLL.linkedList;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class MergeSort {
    ListNode head, tail;
    int size = 0;
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode mid = getMiddle(head);

        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return MergeList(left, right);
    }
    public ListNode getMiddle(ListNode head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        return mid;
    }
    public ListNode MergeList(ListNode first, ListNode second)
    {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;

        if(first == null && second == null)
        {
            return first;
        }

        while(first != null && second != null)
        {
            if(first.val < second.val)
            {
                temp.next = first;
                first = first.next;
                temp = temp.next;
            }
            else
            {
                temp.next = second;
                second = second.next;
                temp = temp.next;
            }
        }
        // If one of the linked list is remaining
        while(first != null)
        {
            temp.next = first;
            first = first.next;
            temp = temp.next;
        }
        while(second != null)
        {
            temp.next = second;
            second = second.next;
            temp = temp.next;
        }
        return dummy.next;
    }
    public void insertAtBeginning(int data)
    {
        ListNode node = new ListNode(data);
        node.next = head;
        head = node;
        if(tail == null)
        {
            tail = head;
        }
        size++;
    }
    public void add(int data)
    {
        ListNode node = new ListNode(data);

        if(head == null)
        {
            head = node;
            tail = head;
        }
        else
        {
            tail.next = node;
            tail = node;
            size++;
        }
    }
    public void display(){
        ListNode temp = head;
        while(temp != null)
        {
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }

// Kunal's code
public ListNode sortList2(ListNode head) {
    if (head == null || head.next == null) {
        return head;
    }

    ListNode mid = getMid(head);
    ListNode left = sortList(head);
    ListNode right = sortList(mid);

    return merge(left, right);
}

    ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

    ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }






    // Another approach --> Naive approach
    public ListNode sortListNaive(ListNode head)
    {
        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;

        while(temp != null)
        {
            list.add(temp.val);
            temp = temp.next;
        }

        Collections.sort(list);

        temp = head;

        int i = 0;

        while(temp!= null && i < list.size())
        {
            temp.val = list.get(i);
            temp = temp.next;
            i++;
        }
        return head;
    }
    public static void main(String[] args) {
        MergeSort list = new MergeSort();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(3);
        list.add(9);

        list.sortList(list.head);
        list.display();
    }
}
