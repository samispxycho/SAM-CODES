package Problems_On_Arrays;

public class HIndex {
    public static int hIndex(int[] citations) {
        int length = citations.length;
        int arr[] = new int[length+1];
        for(int ele : citations){
            if(ele>=length){
                arr[length]+=1;
            }else{
                arr[ele]+=1;
            }
        }
        int count = 0;
        for(int i=arr.length-1;i>=0;i--){
            count+=arr[i];
            if(count>=i){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] citations = {3,0,6,1,5};
        System.out.println(hIndex(citations));
    }
}
