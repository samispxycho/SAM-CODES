package ARRAY;
import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        int[]arr={4,6,3,4,6,7,7,7,2,3};

        HashMap<Integer,Integer>map= new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer>ele:map.entrySet())
            System.out.println(ele.getKey()+" "+ele.getValue());


    }
}
