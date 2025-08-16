package Problems_On_Arrays;

public class ArrangeBySign {
    public int[] rearrangeArray(int[] nums) {
        int arr[] = new int[nums.length];
        int posiIndex=0;
        int negaIndex=1;
        for(int ele:nums){
            if(ele>=0){
                arr[posiIndex] = ele;
                posiIndex+=2;
            }else{
                arr[negaIndex] = ele;
                negaIndex+=2;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        ArrangeBySign obj = new ArrangeBySign();
        int[] nums = {3,1,-2,-5,2,-4};
        int[] res = obj.rearrangeArray(nums);
        for(int x:res){
            System.out.print(x+" ");
        }
    }
}
