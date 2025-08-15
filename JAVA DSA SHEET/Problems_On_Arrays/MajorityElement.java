package Problems_On_Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int ele=-1;
        int count=0;
        for(int i : nums){
            if(count==0){
                count+=1;
                ele=i;
            }
            else if(i == ele) count+=1;
            else count--;
        }
        return ele;
    }
    public static void main(String[] args) {
        MajorityElement obj = new MajorityElement();
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(obj.majorityElement(nums));
    }
}

//ALGORITHM IS KNOWN AS MOORE'S VOTING ALGORITHM AND ONLY WORKS WHEN THERE IS ONLY 1 MAJORITY ELEMENT. CAN BE USED TO SOLVE N/2 OR N/3 PROBLEMS
