package Learn_Basic_Hashing;
import java.util.HashMap;
import java.util.Map;

public class MaxMinFrequency {
    public static void main(String[] args) {
        
        int[]arr={10,5,10,15,10,5};

        HashMap<Integer,Integer>hm=new HashMap<>();

        for(int ele:arr){
            if(hm.containsKey(ele)){
                hm.put(ele,hm.get(ele)+1);
            }else{
                hm.put(ele,1);
            }
        }

        int minKey=-1;
        int min=Integer.MAX_VALUE;

        int maxKey=-1;
        int max=Integer.MIN_VALUE;

        for(Map.Entry<Integer,Integer> me:hm.entrySet()){

            int key=me.getKey();
            int count=me.getValue();

            if(count>max){
                maxKey=key;
                max=count;
            }
            if(count<min){
                minKey=key;
                min=count;
            }

        }

        System.out.println("Element with largest frequency: "+maxKey);
        System.out.println("Element with lowest frequency: "+minKey);

    }

}

