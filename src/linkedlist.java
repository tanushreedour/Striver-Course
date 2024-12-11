import java.util.*;
class node{
    public int data;
    public node next;
    node()
    {
        this.data=0;
        this.next=null;
    }
    node(int item){
        this.data=item;
        this.next=null;
    }
    node(int item, node p){
        this.data = item;
        this.next =  p;
    }
}

public class linkedlist {
    private node head = null;
    private node tail = head;
    void push(int item){
        node newnode = new node(item);
        if(head==null){
            head=newnode;
            tail=newnode;
            newnode.next=null;
        }
        tail.next=newnode;
        tail=tail.next;
    }

    public void display() {
        node n = head;
        while(n!=null){
            System.out.print(n.data+"--->");
            n=n.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
//        ll.push(1);
//        ll.push(2);
//        ll.push(3);
//        ll.push(5);
        for(int i=1;i<=5;i++)
        {
            ll.push(i);
        }
        ll.display();
    }
}

