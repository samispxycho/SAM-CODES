package Problems_On_Arrays;
import java.util.HashSet;

public class Find_The_Union {
    public static void main(String[] args) {
        
        int[]arr1={1,2,3,4,5};
        int[]arr2={2,3,4,5,6};

        HashSet<Integer>hs=new HashSet<>();

        for(int ele:arr1){
            if(!hs.contains(ele)){
                hs.add(ele);
            }
        }

        for(int ele:arr2){
            if(!hs.contains(ele)){
                hs.add(ele);
            }
        }

        for(int ele:hs){
            System.out.print(ele+" ");
        }

    }
}
