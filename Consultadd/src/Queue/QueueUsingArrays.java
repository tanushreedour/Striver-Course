package Queue;

public class QueueUsingArrays {
    int front = -1;
    int rear = -1;
    int size = 0;

    private final int[] queue = new int[10];
    public QueueUsingArrays()
    {
        this.size = 0;
    }
    public void push(int item)
    {
        if(rear >= queue.length)
        {
            System.out.println("Queue is full");
        }
        if(front == -1 && rear == -1)
        {
            front = 0;
            rear = 0;
            queue[rear] = item;
            return;
        }
        rear++;
        queue[rear] = item;
    }
    public int pop()
    {
        if(front == -1)
        {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front++];
    }
    public int top()
    {
        if(front == -1)
        {
            return -1;
        }
        return queue[front];
    }
    public int size()
    {
        return rear-front+1;
    }

    public static void main(String[] args) {
        QueueUsingArrays queue = new QueueUsingArrays();
        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(50);
        queue.push(60);
        queue.push(70);
        queue.push(80);
        System.out.println(queue.top());
        System.out.println(queue.pop());
        System.out.println(queue.top());
    }
}
