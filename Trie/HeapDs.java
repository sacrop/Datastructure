import java.util.ArrayList;
import java.util.Collections;

public class HeapDs {

        private ArrayList<Integer> lst;
        HeapDs(){
            lst=new ArrayList<>();
        }
        
    public void insertHeap(int value){
        lst.add(value);
        upHeap(lst.size()-1);
    }
    public void upHeap(int childIndx){
        if(childIndx==0)return;
        int parentIndx=getParentIndex(childIndx);
        if(lst.get(parentIndx)>lst.get(childIndx)){
            Collections.swap(lst, parentIndx, childIndx);
            upHeap(parentIndx);
        }      
    }
    public int remove(){
       int remove= lst.get(0);
       int news=lst.remove(lst.size()-1);
       if(!lst.isEmpty()){}
       lst.set(0,news);
       downHeap(0);
       return remove;
    }

    private void downHeap(int index){
        if(index==lst.size()-1)return;
        int parent=index;
        int leftIndx=getLeftIndex(index);
        int rightIndx=getRightIndex(index);
        if(leftIndx<lst.size()&&lst.get(parent).compareTo(lst.get(leftIndx))>0){
            parent=leftIndx;
        }
        if(rightIndx<lst.size()&&lst.get(parent).compareTo(lst.get(rightIndx))>0){
            parent=rightIndx;
        }
        if(parent!=index){
            Collections.swap(lst,parent,index);
            downHeap(parent);
        }

    }
    private int getLeftIndex(int index){
        return index*2+1;
    }
    private int getRightIndex(int index){
        return index*2+2;
    }
    public void display(){
        System.out.println(lst);
    }
    
    public int getParentIndex(int childIndx){
        return (childIndx-1)/2;
    }
    public static void main(String[] args) {
        HeapDs hps=new HeapDs();
        int[] arr=new int[]{40,30,20,55,39,22};
        for(int i:arr)
        hps.insertHeap(i);
        hps.display();
        
    }
    
}
