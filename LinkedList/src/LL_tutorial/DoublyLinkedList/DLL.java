package LL_tutorial.DoublyLinkedList;

import java.util.regex.Pattern;

public class DLL {

    private Node head;
    private Node tail;
    private Node temp;
    private int size;
    private class Node
    {
        private int data;
        private Node next;
        private Node prev;

        Node(int data)
        {
            this.data = data;
        }

        Node(int data, Node next)
        {
            this.data =data;
            this.next = next;
        }
        Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public DLL()
    {
        this.size = 0;
    }

    // Operations on Doubly linked list

    // Insert at beginning
    public void InsertFirst(int data) throws NullPointerException
    {
        Node node = new Node(data, head, null);
        if(head == null)
        {
            tail = head;
            head = node;
        }
        head.prev = node;
        head = node;
        size++;
    }

    // Insert a node at end
    public void add(int data) throws NullPointerException
    {
        Node node = new Node(data, null, tail);
        if(head == null)
        {
            InsertFirst(data);
            size--;
        }
        if(tail != null)
        {
            tail.next = node;
        }
        tail = node;
        size++;
    }

    // Insertion at End without using tail pointer
    public void addAtEnd(int data)
    {
        Node node = new Node(data);
        if(head == null)
        {
            InsertFirst(data);
        }
        else
        {
            temp = head;

            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = node;
            node.prev = temp;
            node.next = null;
            temp = node;

            tail = node;
            size++;
        }
    }

    // Print size of DLL
    public int getSize()
    {
        return size;
    }

    // Display a doubly linked list
    public void display()
    {
        if(head == null)
        {
            System.out.println("NULL");
        }
        else
        {
            temp = head;

            while(temp != null)
            {
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.print("NULL");
        }
    }

    // Insertion at a specific position
    public void insertAt(int data, int pos)
    {
        Node node = new Node(data);

        if(pos <= 0)
        {
            System.out.println("Please enter a valid position to add a node.");
        }
        if(pos == 1)
        {
            InsertFirst(data);
        }
        if(pos == 2)
        {
            Node ptr = head.next;
            head.next = node;
            node.prev = head;
            node.next = ptr;
            ptr.prev = node;
            size++;
        }

        temp = head;

        if(pos >= 3)
        {
            for (int i = 1 ; i < pos - 1 ; i++)
            {
                temp = temp.next;
            }
            Node ptr = temp.next;
            temp.next = node;
            node.prev = temp;
            node.next = ptr;
            ptr.prev = node;
            size++;
        }
    }

    // Delete first node
    public void DeleteFirst()
    {
        try
        {
            if(head != null)
            {
                head = head.next;
                head.prev = null;
                size--;
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    // Delete last node
    public void deleteLast()
    {
        temp = head;
        if(head != null)
        {
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp = temp.prev;
            temp.next = null;
        }
        else{
            tail = head;
        }
    }

    // Deletion at a specific position
    public void deleteNode(int pos)
    {
        if(pos == size)
        {
            deleteLast();
        }
        if(pos > size || pos <= 0)
        {
            System.out.println("Invalid position");
        }
        if(pos == 1)
        {
            DeleteFirst();
        }
        if(pos == 2)
        {
            Node ptr = head.next;
            head.next = ptr.next;
            ptr = ptr.next;
            ptr.prev = head;

            size--;
        }
        if(pos >= 3)
        {
            temp = head;
            for(int i =1 ; i < pos - 1 ; i++)
            {
                temp = temp.next;
            }
            Node ptr = temp.next;
            temp.next = ptr.next;
            if(ptr.next != null)
            {
                ptr = ptr.next;
                ptr.prev = temp;
                size--;
            }
            else {
                deleteLast();
            }
        }
    }

    public void deleteNode2(int index)
    {
        try{
            if(head == null){
                return;
            }else if(index < 1 || index > size){
                throw new Exception("invalid index exception");
            }else if(index == 1){
                this.head = this.head.next;
                this.head.prev = null;
            }else if(index == size){
                Node temp = this.tail.prev;
                temp.next = null;
                tail.prev = null;
                this.tail = temp;
            }else if(index > 1 && index < size){
                Node temp = this.head;
                Node Follow = null;
                for(int i=1;i<index;i++){
                    Follow = temp;
                    temp = temp.next;
                }
                Follow.next = temp.next;
                temp.next.prev = Follow;
                temp.next = null;
                temp.prev = null;
            }
            this.size--;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    // Find an element in a doubly linked list
    public int find(int data)
    {
        temp = head;

        for(int i = 1; i <= size ; i++)
        {
            if(temp.data == data)
            {
                return i;
            }
            temp = temp.next;
        }
        return -1;  // means element not exists in the linked list
    }
    public void getHead()
    {
        System.out.println(head);
    }
}
