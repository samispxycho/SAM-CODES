package NUMBERS;

public class PallinRange {
    public static void main(String[] args) {
        int start=10;
        int end=50;

        for(int i = start;i<=end;i++){
            int num = i;
            int rev=0;
            while(num > 0){
                int d=num%10;
                rev = (rev * 10) +d;
                num/=10;
            }
            if(rev == i)System.out.println(i);
        }

    }
}
