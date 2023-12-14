public class Queue {
    private int[] data;
    private static int MAX_VALUE=10;

    Queue(){
        this(MAX_VALUE);
    }
    Queue(int value){
        data=new int[value];
    }

    private int start=-1;
    private int end=-1;
    public static void main(String[] args) {
        Queue queue=new Queue();

    }
}
