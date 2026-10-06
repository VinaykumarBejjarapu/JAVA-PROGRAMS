public class MyStack {
    int cap;
    int arr[];
    int top;

    MyStack(int c) {
        top = -1;
        cap = c;
        arr = new int[cap];
    }

    void push(int c) {
        if (top == cap - 1)
            System.out.println("Stack Overflow");
        top++;
        arr[top] = c;
    }

    int pop() {
        if (top == -1)
            System.out.println("Stack Underflow");
        int res = arr[top];
        top--;
        return res;
    }
    int peak()
    {
        if(top==-1) {
            System.out.println("stack underflow");
        }
        return arr[top];
    }

    int size() {
        if (top == -1)
            return 0;
        else
            return top + 1;
    }
    boolean isEmpty()
    {
        return top==-1;
    }
}
class Home{
    public static void main(String args[])
    {
        MyStack s =new MyStack(10);
          int a=s.peak();
          s.push(9);
          s.push(18);
          s.push(27);
          s.push(36);
          s.push(45);
          s.push(5);
          System.out.println(s.peak());
          System.out.println(s.pop());
          System.out.println(s.isEmpty());
          System.out.println(s.size());          
    }
}