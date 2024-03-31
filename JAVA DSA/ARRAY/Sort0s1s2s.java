package ARRAY;

public class Sort0s1s2s {
    public static void main(String[] args) {
        int[] arr ={0,1,2,0,1,2,1,2,0,0,0,1};
        
        int zero=0;
        int one=0;
        int two=0;

        for(int ele: arr){
            if(ele==0)zero++;
            else if(ele==1)one++;
            else two++;
        }

        for(int i=0;i<arr.length;i++){
            if(zero > 0){
                arr[i]=0;
                zero--;
            }
            else if(one>0){
                arr[i]=1;
                one--;
            }
            else if(two > 0){
                arr[i]=2;
                two--;
            }
        }

        for(int ele:arr){
            System.out.print(ele+" ");
        }


    }
}
