package Learn_Basic_Hashing;
import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        
        int arr[]={2, 3, 2, 3, 5};

        HashMap<Integer,Integer>hm=new HashMap<>();

        for(int ele:arr){
            if(hm.containsKey(ele)){
                hm.put(ele, hm.get(ele)+1);
            }else{
                hm.put(ele,1);
            }
        }

        for(Map.Entry<Integer,Integer> me:hm.entrySet()){
            System.out.println(me.getKey()+":"+me.getValue());
        }

    }
}
