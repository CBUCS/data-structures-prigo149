class Stack
{
    int top;
    int a[] = new int[100]; // Maximum number of elements in Stack

    boolean a()
    {
        return (top < 0);
    }

    boolean push(int x)
    {
        if (top >= 99)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            a[++top] = x;
            return true;
        }
    }

    int pop()
    {
        if (top < 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            int x = a[top--];
            return x;
        }
    }
}

