package Stack;

class Node{
    int data;
    Node next;
    Node prev;

    Node()
    {

    }
    Node(int item)
    {
        this.data = item;
    }
    Node(int item, Node node)
    {
        this.data = item;
        this.next = node;
    }
    Node(int item, Node node1, Node node2)
    {
        this.data = item;
        this.next = node1;
        this.prev = node2;
    }
}

class stack
{
    Node top = null;
    Node temp = top;
    Node tail;

    int size;
    stack()
    {
        this.size = 0;
    }
    public Node findTail()
    {
        temp = top;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        return temp;
    }
    public void push(int data)
    {
        Node node = new Node(data);
        if(top == null)
        {
            top = node;
            temp = node;
            return;
        }
        temp.next = node;
        node.prev = temp;
        temp = temp.next;
        size++;
    }
    public int pop()
    {
        int item;
        tail = findTail();
        if(tail == null)
        {
            return -1;
        }
        if(top.next == null)
        {
            item = top.data;
            top = top.prev;
            return item;
        }
        item = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return item;
    }
    public int top()
    {
        if(temp ==  null)
        {
            return -1;
        }
        return temp.data;
    }
    public int size()
    {
        return size;
    }
}
public class StackUsingLL
{
    public static void main(String[] args) {
        stack st = new stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        System.out.println(st.top());
        System.out.println(st.pop());
        System.out.println(st.top());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
