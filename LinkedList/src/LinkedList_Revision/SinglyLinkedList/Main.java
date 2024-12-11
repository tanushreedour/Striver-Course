package LinkedList_Revision.SinglyLinkedList;
import LinkedList_Revision.Node;

public class Main {
    Node head;
    Node temp;
    int size;

    public Main()
    {
        this.size = 0;
    }

    // Find tail of a singly linked list
    public Node findTail()
    {
        temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        return temp;
    }

    // Adding an element to the last of linked list
    public void add(int data)
    {
        Node node = new Node(data);

        if(head == null)
        {
            head = node;
        }
        else{
            Node tail = findTail();
            tail.next = node;
        }
        size++;
    }

    // Adding an element to at the beginning of linked list
    public void insertAtBeginning(int data)
    {
        Node node = new Node(data);

        if(head == null)
        {
            head = node;
        }
        node.next = head;
        head = node;
        size++;
    }

    // Insert at a specific position
    public void insertAtPosition(int data, int pos)
    {
        Node node = new Node(data);

        if(pos == 1)
        {
            insertAtBeginning(data);
            return;
        }

        // Boundary condition
        if(head == null)
        {
            head = node;
        }
        temp = head;

        for(int i =1; i < pos-1 ; i++)
        {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    // Deleting node at beginning
    public void deleteAtBeginning()
    {
        head = head.next;
        size--;
    }

    // Deleting node at last
    public void deleteAtLast()
    {
        temp = head;

        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }

    // Delete a node at a specific position from a linked list
    public void deleteAtSpecificPosition(int pos)
    {
        temp = head;
        if(pos == 1)
        {
            deleteAtBeginning();
            return;
        }
        if(pos == 2)
        {
            temp.next = temp.next.next;
        }
        if(pos >= 3)
        {
            for (int i = 1; i < pos - 1; i++) {
                temp = temp.next;
            }
            Node ptr = temp.next;
            temp.next = ptr.next;
            ptr.next = null;
            size--;
        }
    }

    // Updating a node in linked list
    public void updateNode(int data, int pos)
    {
        deleteAtSpecificPosition(pos);
        insertAtPosition(data, pos);
    }

    // Finding the middle of linked list
    public Node findMiddle(Node head)
    {
        Node fast = head;
        Node slow = head;

        while(fast.next != null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    // Inserting a node at the middle of linked list
    public void insertAtMiddle(int data, Node head)
    {
        Node mid = findMiddle(head);
        Node node = new Node(data);
        Node temp = mid.next;
        mid.next = node;
        node.next = temp;
    }

    // Displaying linked list
    public void display()
    {
        temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print("NULL\n-----------------------------------------------------------------\n");
    }

    // Printing size of linked list
    public int getSize()
    {
        return size;
    }

    // Find head
    public Node getHead()
    {
        return head;
    }


    public static void main(String[] args) {
        Main ll = new Main();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);
        ll.add(70);
        ll.add(80);
        ll.add(90);
        ll.add(100);
        ll.add(110);

        ll.display();
        System.out.println(ll.getSize());
        System.out.println("\n__________________________________________\n");

        ll.deleteAtLast();
        ll.display();

        ll.deleteAtBeginning();
        ll.display();

        ll.deleteAtSpecificPosition(4);
        ll.display();
        System.out.println(ll.getSize());


    }
}
