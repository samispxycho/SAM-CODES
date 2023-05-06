import java.util.stream.IntStream;

class test{
    public static int main(String[] args) {
        int[]arr={2,3,1,5,7};
        int target=10;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    int[] ind={i,j};
                    return ind;
                }
            }
        }
    }
}