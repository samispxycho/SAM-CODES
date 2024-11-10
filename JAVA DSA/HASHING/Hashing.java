import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {
        
        int arr[]={1,4,4,9,6,10,13,9,13,18,20,20,1,1,1};

        HashMap<Integer,Integer>hm=new HashMap<>(); 

        for(int ele:arr){
            if(hm.containsKey(ele)){
                hm.put(ele, hm.get(ele)+1);
            }else{
                hm.put(ele, 1);
            }
        }

        for (int key : hm.keySet()) {
            System.out.println(key + ": " + hm.get(key));
        }

    }
}
