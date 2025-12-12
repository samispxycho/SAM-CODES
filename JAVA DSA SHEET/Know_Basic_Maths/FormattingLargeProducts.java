package Know_Basic_Maths;

public class FormattingLargeProducts {
    public static void main(String[] args) {
        
        int a = 3;
        int b = 6;
        int result = 1;

        for(int i=a;i<=b;i++){
            result*=i;
        }

        int zeroCount = 0;
        int temp = result;

        while(temp>0){
            int d = temp%10;
            if(d!=0)break;
            zeroCount+=1;
            temp/=10;
        }
        
        System.out.println(temp + " * 10^"+zeroCount);
    }
}
