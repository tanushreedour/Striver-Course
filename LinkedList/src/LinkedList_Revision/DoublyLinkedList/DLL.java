package LinkedList_Revision.DoublyLinkedList;
import LinkedList_Revision.Node;

import java.util.Collections;
import java.util.List;

public class DLL {
    Node head;
    Node temp;
    Node tail;
    int size = 0;

    DLL()
    {
        this.size = 0;
    }

    // Insertion of a node at beginning
    public void insertAtBeginning(int data)
    {
        Node node = new Node(data);
        if(head == null)
        {
            head = node;
        }
        head.prev = node;
        node.next = head;
        head = node;

        size++;
    }

    // Finding head of linked list
    public Node getHead()
    {
        return head;
    }

    // Finding a tail of doubly linked list
    public Node findTail()
    {
        temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        return temp;
    }

    // Inserting a node at the end of linked list
    public void insertAtLast(int data)
    {
        Node node = new Node(data);
        if(head == null)
        {
            head = node;
            return;
        }
        temp = findTail();
        temp.next = node;
        node.prev = temp;
        
        size++;
    }

    // Reach a specific node
    public Node findNode(int pos)
    {
        temp = head;
        for(int i =1; i < pos ; i++)
        {
            temp = temp.next;
        }
        return temp;
    }
    // Insertion of a node at specific position
    public void insertAtSpecificPosition(int data, int pos)
    {
        if(pos == 1)
        {
            insertAtBeginning(data);
            size--;
        }
        if(pos == size)
        {
            insertAtLast(data);
            size--;
        }
        Node node = new Node(data);
        Node ptr = findNode(pos);
        temp = ptr.prev;
        node.next = ptr;
        node.prev = temp;
        temp.next = node;
        ptr.prev = node;

        size++;
    }

    // Delete a node from beginning
    public void deleteAtStart()
    {
        if(head == null)
        {
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    // Delete from last
    public void deleteAtLast()
    {
        tail = findTail();
        if(head == null || tail == null)
        {
            return;
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    // Delete a node at a specific position
    public void deleteAtSpecificPosition(int pos)
    {
        if(pos == 1)
        {
            deleteAtStart();
            size++;
        }
        if(pos == getSize())
        {
            deleteAtLast();
            size++;
        }
        if(head == null)
        {
            tail = null;
        }
        temp = findNode(pos);
        Node ptr = temp.next;
        temp.prev.next = ptr;
        ptr.prev = temp.prev;
        temp.prev = null;
        temp.next = null;
        size--;
    }

    // Reverse a doubly linked list
    public Node reverse(Node head)
    {
        if(head == null)
        {
            return null;
        }
        if(size == 1)
        {
            return head;
        }
        Node last = null;
        Node curr = head;

        while(curr != null)
        {
            last = curr.prev;
            curr.prev = curr.next;
            curr.next = last;
            curr = curr.prev;
        }
        return last.prev;
    }

    // Return the size of doubly linked list
    public int getSize()
    {
        return size;
    }

    // Displaying the linked list
    public void display()
    {
        temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("NULL\n-------------------------------------------------\n");
    }

    public static void main(String[] args) {
        DLL ll = new DLL();
        ll.insertAtLast(10);
        ll.insertAtLast(20);
        ll.insertAtLast(30);
        ll.insertAtLast(40);
        ll.insertAtLast(50);
        ll.insertAtLast(60);
        ll.insertAtLast(70);
        ll.insertAtLast(80);
        ll.insertAtLast(90);
        ll.insertAtLast(100);
        ll.insertAtBeginning(120);
        Node node = ll.findNode(4);
        System.out.println(node.data);
        ll.insertAtSpecificPosition(99, 4);
        ll.display();
        System.out.println(ll.getSize());

        ll.deleteAtLast();
        ll.deleteAtStart();
        ll.deleteAtSpecificPosition(5);
        ll.display();

        Node ptr = ll.reverse(ll.getHead());
        ll.display2(ptr);
    }

    private void display2(Node ptr) {
        if(ptr == null)
        {
            System.out.print("NULL\n");
        }
        else {
            System.out.print(ptr.data + "-->");
            display2(ptr.next);
        }
    }
}
