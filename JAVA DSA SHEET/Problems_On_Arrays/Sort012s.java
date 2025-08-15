package Problems_On_Arrays;

public class Sort012s {
    public void sortColors(int[] nums) {
        int zero=0;
        int one=0;
        int two=0;
        for(int ele:nums){
            if(ele==0)zero+=1;
            else if(ele==1)one+=1;
            else two+=1;
        }
        for(int i=0;i<nums.length;i++){
            if(zero>0){
                nums[i]=0;
                zero--;
            }else if(one>0){
                nums[i]=1;
                one--;
            }else if(two>0){
                nums[i]=2;
                two--;
            }
        }
    }
    public static void main(String[] args) {
        Sort012s obj = new Sort012s();
        int[] nums = {2,0,2,1,1,0};
        obj.sortColors(nums);
        for(int num:nums){
            System.out.print(num + " ");
        }
    }
}
