package SEM2_LAB;

interface Sortable {
    void sort(int[] arr);
}

class Bubble implements Sortable {
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

class Selection implements Sortable {
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}



public class SortingQues {

    static void display(int[]arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }

    public static void main(String[] args) {
        int[]arr1={17,15,21,28,10,32};
        int[]arr2={89,67,102,84,17,21};

        System.out.print("Bubble sort: ");
        Sortable bubble=new Bubble();
        bubble.sort(arr1);
        SortingQues.display(arr1);

        System.out.print("\nSelection sort: ");
        Sortable selection=new Selection();
        selection.sort(arr2);
        SortingQues.display(arr2);

    }
}
