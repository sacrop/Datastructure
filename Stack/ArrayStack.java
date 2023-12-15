public class ArrayStack {
    public static void main(String[] args) {

        try {
            Stack stk = new Stack();
            stk.push(5);
            stk.push(2);
            stk.push(3);
           System.out.println( stk.pop());
           System.out.println( stk.pop());
           System.out.println( stk.pop());
           System.out.println( stk.pop());
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}

class Stack {
    protected int[] arr;
    private static int DEFAULTVALUE = 10;

    Stack() {
        this(DEFAULTVALUE);
    }

    Stack(int size) {
        arr = new int[size];
    }

    private int ptr = -1;

    public void push(int data) {
        if (ptr == arr.length - 1) {
            System.out.println("stack is full");
        } else {
            ptr++;
            arr[ptr] = data;
        }
    }

    public int pop() throws Exception {
        if (ptr == -1) {
            throw new Exception("stack is empty");
        }

        return arr[ptr--];
    }

    public boolean empty() {
        if (ptr == -1)
            return true;
        return false;
    }

    public int peek() throws Exception {
        if (ptr == -1) {
            throw new Exception("stack is empty");
        }
        return arr[ptr];
    }
}