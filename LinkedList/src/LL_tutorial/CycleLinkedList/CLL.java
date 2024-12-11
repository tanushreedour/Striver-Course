package LL_tutorial.CycleLinkedList;
import LL_tutorial.Middle.Node;
public class CLL {
    Node head;

// Check whether a linked list contains a cycle or not
    // Leetcode - 141
    // Amazon or Microsoft
    public boolean hasCycle()
    {
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow)
            {
                return true;
            }
        }
        return false;
    }

    // Find the length of cycle
    public int cycleLength()
    {
        Node fast = head;
        Node slow = head;

        int count = 0;

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow)
            {
                Node temp = slow;
                do
                {
                    temp = temp.next;
                    count++;
                }
                while(temp != slow);
            }
        }
        return count;
    }
}
