public class Count_ele {
    public static void main(String[] args) {
        
        int[]arr={3,1,8,10,3,7,1,1,2,6,6,11};

        int hashArr[]=new int[13];
        
        for(int i=0;i<arr.length;i++){
            int ele = arr[i];
            hashArr[ele]++;
        }

        for(int ele:hashArr){
            System.out.print(ele+" ");
        }
        
        System.out.println(hashArr[1]);

    }
}
