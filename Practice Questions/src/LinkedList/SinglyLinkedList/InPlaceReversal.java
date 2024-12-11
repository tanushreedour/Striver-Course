package LinkedList.SinglyLinkedList;

class Node{
    int data;
    Node next;
    Node()
    {

    }
    Node(int data)
    {
        this.data = data;
    }
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}
public class InPlaceReversal {
    Node head;
    Node temp;

    public void add(int data)
    {
        Node node = new Node(data);
        if(head == null)
        {
            head = node;
            return;
        }
        temp = head;

        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void display(Node head)
    {
        if(head == null)
        {
            System.out.print("NULL\n");
            return;
        }
        System.out.print(head.data + " --> ");
        display(head.next);
    }

    // Reversal
    public Node reverse(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node prev = null;
        temp = head;
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

    public static void main(String[] args) {
        InPlaceReversal list = new InPlaceReversal();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);

        Node head = list.head;

        list.display(head);

        Node rev = list.reverse(head);
        list.display(rev);
    }
}
