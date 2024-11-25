package Problems_On_Arrays;

public class Largest_element {
    public static void main(String[] args) {
        
        int[]arr={1,8,7,90,56};

        int check=arr[0];
        int i=0;
        
        while(i<arr.length){
            if(check<arr[i])check=arr[i];
            i++;
        }

        System.out.println("Largest element is: "+check);

    }
}
