public class Stack {
    private int[] data;
    private static int DEFAULT_SIZE=10;
    Stack(){
        this(DEFAULT_SIZE);
    }
    Stack(int size){
        data=new int[size];
    }
    private void push(int value){
        isFull();
        ptr++;
        data[ptr]=value;
    }
    private int ptr=-1;
    private  boolean isEmpty(){
        if(ptr==-1){
            System.out.println("stack is empty");
            return true;
        }
        return false;
    }
    private void isFull(){
        if(ptr==data.length-1){
            System.out.println("stack is full");
        }
    }
    private int pop(){
        if(isEmpty())return -1;
        int num=data[ptr];
        ptr--;
        return num;
    }
    private void display(){
        System.out.print("[");
        for(int i=0;i<data.length;i++){
            if(data[i]!=0){
                System.out.print(" "+data[i]+" ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Stack stk=new Stack();
        stk.push(10);
        stk.push(20);
        stk.push(80);
        stk.push(12);
        stk.display();
        System.out.println();
        System.out.println(stk.pop()+" is popped out of the stack");
        System.out.println();
        stk.display();
    }
}
