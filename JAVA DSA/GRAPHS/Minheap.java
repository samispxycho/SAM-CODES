package GRAPHS;
import java.util.ArrayList;

class ThisIsMinHeap{
    ArrayList<Integer>heap;
    
    ThisIsMinHeap(){
        heap=new ArrayList<>();
    }

    void insert(int value){
        heap.add(value);
        heapify(heap.size()-1);
    }

    void heapify(int index){
        while(index>0){
            int parent=(index-1)/2;
            if(heap.get(index) < heap.get(parent)){
                int temp=heap.get(index);
                heap.set(index,heap.get(parent));
                heap.set(parent,temp);

                index=parent;
            }else{
                break;
            }
        }
    }

    void display(){
        System.out.println();
        for(int ele:heap){
            System.out.print(ele+" ");
        }
    }
    
}

public class Minheap {
    public static void main(String[] args) {
        ThisIsMinHeap heap=new ThisIsMinHeap();
        heap.insert(2);
        heap.insert(3);
        heap.insert(4);
        heap.insert(5);
        heap.insert(6);
        heap.display();

        heap.insert(1);
        heap.display();
    }
}
