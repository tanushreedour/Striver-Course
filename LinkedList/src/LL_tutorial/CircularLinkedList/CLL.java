package LL_tutorial.CircularLinkedList;

import LL_tutorial.Middle.Node;

public class CLL {
    Node head;
    Node tail;

    int size;
    CLL()
    {
        this.head = null;
        this.tail =null;
        size = 0;
    }

    public void add(int data)
    {
        Node node = new Node(data);
        if(head == null)
        {
            head = node;
            tail = node;
            size++;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    public void delete(int pos)
    {
        if(head == null)
        {
            System.out.println("List is empty! Deletion not possible");
        }
        else
        {
            if(pos <= 0)
            {
                System.out.println("This position does not exists in the linked list.");
            }
            else if(pos == 1)
            {
                tail.next = head;
                head = head.next;
                size--;
            }
            else if(pos == 2)
            {
                head.next = head.next.next;
                size--;
            }
            else if(pos >= 3)
            {
                Node temp = head;
                for(int i =1 ; i < pos - 1 ; i++)
                {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                size--;
            }
        }
    }
    public void display()
    {
        Node temp = head;
        while(temp.next != head)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print(temp.data + " -> HEAD");
    }
}
