package SEM2_LAB;

interface Sortable{
    void sort(int[]arr);
}


class Bubble implements Sortable{
    public void sort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
}

class Selection implements Sortable{
    public void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }

        
    }
}

public class ArrayInterface {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        Bubble b=new Bubble();
        b.sort(arr);

        for(int ele:arr){
            System.out.print(ele+" ");
        }

        System.out.println();

        int arr2[]={10,9,8,7,6};
        Selection s=new Selection();
        s.sort(arr2);

        for(int ele1:arr2){
            System.out.print(ele1+" ");
        }

    }
}
