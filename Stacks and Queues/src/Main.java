class stack {
    int top = -1;
    int size = 0;
    private final int[] stack = new int[100];

    // Empty stack
    public stack() {
    }

    // Push operation
    public void push(int item)
    {
        if(top >= stack.length)
        {
            System.out.println("Stack is full");
        }
        top++;
        stack[top] = item;
    }

    public int peek()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
        }
        return stack[top];
    }

    public int pop()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
        }
        return stack[top--];
    }

    public int size()
    {
        return top + 1;
    }
}

public class Main
{
    public static void main(String[] args) {
        stack st = new stack();
        st.push(12);
        st.push(2);
        st.push(32);
        st.push(34);
        st.push(1);
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}