package LinkedList_Revision.CircularLinkedList;
import LinkedList_Revision.Node;
public class CLL {
    Node head;
    Node temp;
    Node tail;
    int size;

    CLL()
    {
        this.size= 0;
    }

    // Finding head of CLL
    public Node getHead()
    {
        return head;
    }

    //FInding size
    public int getSize()
    {
        return size;
    }

    // Finding tail of linked list
    public Node getTail()
    {
        tail = head;
        while(tail.next != head)
        {
            tail = tail.next;
        }
        return tail;
    }

    // Findong a node in CLL
    public Node findNode(int pos)
    {
        temp = head;
        for(int i = 1; i< pos-1 ; i++)
        {
            temp = temp.next;
        }
        return temp;
    }

    // Insertion at beginning
    public void insertAtBeginning(int data)
    {
        Node node = new Node(data);
        if(head == null)
        {
            tail = node;
            head = node;
        }
        node.next = head;
        tail.next = node;
        head = node;
        size++;
    }

    // Insertion at end
    public void insertAtEnd(int data)
    {
        Node node = new Node(data);
        if(head == null)
        {
            head = node;
            tail = node;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    // Insertion at specific position
    public void insertAtSpecificPosition(int data, int pos)
    {
        Node node = new Node(data);
        if(head == null || tail == null)
        {
            head = node;
            tail = node;
        }
        if(pos == size)
        {
            insertAtEnd(data);
        }
        if(pos == 1)
        {
            insertAtBeginning(data);
        }
        temp = findNode(pos);
        node.next = temp.next;
        temp.next = node;

        size++;
    }

    // Delete at start
    public void deleteAtStart()
    {
        if(head == null || tail == null)
        {
            return;
        }
        tail = getTail();
        tail.next = head.next;
        head = head.next;
        size--;
    }

    // Delete at last
    public void deleteAtLast()
    {
        if(head == null)
        {
            tail = null;
        }
        temp = findNode(size);
        tail = getTail();
        temp.next = tail.next;
        size --;
    }

    // Delete at specific position
    public void deleteAtSpecificPosition(int pos)
    {
        if(pos == 1 )
        {
            deleteAtStart();
            size++;
        }
        if(pos == size)
        {
            deleteAtLast();
            size++;
        }
        temp = findNode(pos);
        temp.next = temp.next.next;
        size--;
    }

    // Displaying linked list
    public void display()
    {
        temp = head;
        while(temp.next != head)
        {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.print(temp.data + " --> head\n");
    }


    public static void main(String[] args) {
        CLL cll = new CLL();
        cll.insertAtEnd(12);
        cll.insertAtBeginning(10);
        cll.insertAtEnd(20);
        cll.insertAtEnd(30);
        cll.insertAtEnd(40);
        cll.insertAtEnd(50);
        cll.insertAtEnd(60);
        cll.insertAtEnd(70);
        cll.insertAtEnd(80);
        cll.insertAtEnd(90);
        cll.insertAtEnd(100);
        cll.insertAtEnd(120);
        cll.insertAtEnd(130);
        cll.display();
        cll.deleteAtLast();
        cll.deleteAtStart();
        cll.deleteAtSpecificPosition(5);
        cll.insertAtSpecificPosition(33, 6);
        cll.display();
    }
}
