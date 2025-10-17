package Problems_On_Arrays;

public class MergeArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int index = (m+n)-1;
        while(i>=0 && j>=0){
            if(nums1[i] >= nums2[j]){
                nums1[index] = nums1[i];
                index-=1; i-=1; 
            }else{
                nums1[index] = nums2[j];
                index-=1; j-=1;
            }
        }
        while(j>=0){
            nums1[index--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
        
        for(int ele:nums1){
            System.out.print(ele+" ");
        }

    }
}
