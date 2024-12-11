package LL_tutorial.SinglyLL;

import LL_tutorial.Middle.Node;
import java.util.Stack;


public class linkedList {

    private Node head;
    private Node tail;
    private Node temp = head;
    private int size;

    public linkedList()
    {
        this.size = 0;
    }
    public class Node {
        public int data;
        public Node next;

        public Node()
        {

        }

        public Node(int data)
        {
            this.data = data;
        }

        public Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }

    // Operations on Singly linked list
    public void insertAtBeginning(int data)
    {
        Node node = new Node(data);
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
        Node node = new Node(data);

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

    // Inserting a node at a specific position
    public void addAt(int data, int pos)    // pos = position on which you want to insert a node
    {
        Node node = new Node(data);

        if(head == null)
        {
            head = node;
            temp = head;
            size++;
            return;
        }
        temp = head;

        for (int i = 1; i < pos - 1; i++)
        {
            temp = temp.next;
        }
        Node ptr = temp.next;
        temp.next = node;
        node.next = ptr;
        temp = ptr;
        size++;
    }

    // Deletion at beggining in a singly linked list
    public void DeleteFirst()
    {
        if(size == 1)
        {
            head = null;
            tail = null;
        }
        if(head == null)
        {
            tail = null;
        }
        head = head.next;
        size--;
    }

    // Deletion at last in a singly linked list

    public void DeleteLast()
    {
        temp = head;
        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;

        if(head == null){
            tail = null;
        }
        if(size == 1)
        {
            DeleteFirst();
        }
    }

    // Delete at a specific position
    public void deleteAt(int pos)
    {
        if(pos == 0)
        {
            DeleteFirst();
        }
        if(head == null)
        {
            tail = null;
        }
        temp = head;

        for( int i = 1 ; i < pos - 1 ; i++)
        {
            temp = temp.next;
        }
        Node ptr = temp.next;
        temp.next = ptr.next;
        ptr.next = null;
        size--;
    }

    // Delete a node at a position entered from last
    public void deleteFromLast(int pos)
    {
        deleteAt(size+2 - pos);
    }

    // For accessing the node via position
    public void getNode(int pos)
    {
        temp = head;
        for(int i = 1 ; i < pos - 1 ; i++)
        {
            temp = temp.next;
        }
    }

    // To find a node in a linked list of desired value
    public int findNode(int data)
    {
        if(head == null)
        {
            return -1;
        }
        temp = head;
        for(int i = 1; i <= size; i++)
        {
            if(temp.data == data)
            {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    public void size()
    {
        System.out.println(size);
    }
    public void display(){
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }

    // Find the middle element of singly linked list
    public Node findMiddle()
    {
        Node fast = head;
        Node slow = head;
        if(head == null)
        {
            return null;
        }
        for(int i = 1 ; i <= size ; i++)
        {
            if(fast.next == null)
            {
                return slow;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public Node getHead()
    {
        return head;
    }

    // Inserting a node via recursion
    public void InsertRec(int data, int pos, Node temp)
    {
        if(pos == 2)
        {
            Node node = new Node(data);
            Node ptr = temp.next;
            temp.next = node;
            node.next = ptr;
            size++;
            return;
        }
        InsertRec(data, pos - 1, temp.next);
    }

    // Remove duplicates in a linked list
    // Linked list will be sorted
    public void removeDuplicates()
    {
        Node node = head;
        if(head == null){
            tail = null;
        }
        else {
            while(node.next != null)
            {
                if(node.data == node.next.data)
                {
                    node.next = node.next.next;
                    size--;
                }
                else {
                    node = node.next;
                }
            }
        }
    }

    // Merge two linked list
    public static linkedList merge(linkedList first, linkedList second)
    {
        Node f = first.head;
        Node s = second.head;

        linkedList ans = new linkedList();

        while(f != null && s != null)
        {
            if(f.data < s.data)
            {
                ans.add(f.data);
                f = f.next;
            }
            else {
                ans.add(s.data);
                s = s.next;
            }
        }
        // If one of the list's nodes are remaining, add them also
        while(f != null)
        {
            ans.add(f.data);
            f = f.next;
        }
        while(s != null)
        {
            ans.add(s.data);
            s = s.next;
        }
        return ans;
    }

    // Reverse of a linked list
    public static linkedList.Node Reverse(linkedList.Node listHead)
    {
        Node temp = listHead;
        Stack<Integer> st = new Stack<>();

        if(listHead == null)
        {
            return listHead;
        }

        while(temp != null)
        {
            st.push(temp.data);
            temp = temp.next;
        }

        temp = listHead;

        while(temp != null)
        {
            temp.data = st.peek();
            st.pop();
            temp = temp.next;
        }
        return listHead;
    }

    // Optimized code for reversal of singly linked list
    // In place Reversal
    public Node Reversal(Node head)
    {
        if(head == null)
        {
            return head;
        }

        temp = head;
        Node prev = null;
        Node front;

        while(temp != null)
        {
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }

    // Another display method using recursion
    public static void display2(Node head)
    {
        if(head == null)
        {
            System.out.print("NULL\n");
            return;
        }
        else
        {
            System.out.print(head.data + " -> ");
            display2(head.next);
        }
    }

    // Merge two sorted linked lists and return the head of merged list
    // We are going to use a dummy pointer for this
    public Node Mergelists(Node first, Node second)
    {
        Node dummy = new Node();
        Node temp = dummy;

        if(first == null || second == null)
        {
            return dummy;
        }

        while(first != null && second != null)
        {
            if(first.data < second.data)
            {
                temp.next = first;
                first = first.next;
                temp = temp.next;
            }
            else {
                temp.next = second;
                temp = temp.next;
                second = second.next;
            }
        }
        while(first != null)
        {
            temp.next = first;
            temp = temp.next;
            first = first.next;
        }
        while(second != null)
        {
            temp.next = second;
            temp = temp.next;
            second = second.next;
        }

        return dummy;
    }
    public int getSize()
    {
        return size;
    }
    @Override
    public String toString()
    {
        return new String(" ");
    }

    public static void main(String[] args) {
        linkedList first = new linkedList();
        first.add(1);
        first.add(2);
        first.add(3);
        first.add(4);

        linkedList second = new linkedList();
        second.add(1);
        second.add(4);
        second.add(5);
        second.add(8);

        linkedList ans = merge(first, second);
        ans.display();

//        Node ptr = first.getHead();
//        int val = ptr.data;
//        System.out.println(val);
//        System.out.println(ptr.next.data);

//        Node node = Reverse(first.getHead());
//        display2(node);

        linkedList list = new linkedList();
        Node ptr = list.Mergelists(first.getHead(), second.getHead());
        display2(ptr);

        Node middle = first.findMiddle();
        System.out.println("\nMiddle element is : " + middle.data);

        second.deleteFromLast(2);
        second.display();

        linkedList list3 = new linkedList();
        list3.add(10);
        list3.add(20);
        list3.add(30);
        list3.add(40);
        list3.add(50);
        list3.add(60);

        Node node = list3.Reversal(list3.getHead());
        display2(node);
    }
}
