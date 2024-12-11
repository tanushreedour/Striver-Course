package LL_tutorial.Middle;

public class MiddleLL {
    Node head;
    Node fast;
    Node slow;
    int size;

    MiddleLL()
    {
        this.size = 0;
    }

    public Node findMiddle()
    {
        fast = head;
        slow = head;
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
}
