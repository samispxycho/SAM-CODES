package NUMBERS;

public class PrimeRange {
    public static void main(String[] args) {
        int start=10;
        int end=50;

        for(int i=start;i<=end;i++){
            int count=1;
            for(int j=2;j<=i;j++){
                if(i%j==0) count++;
            }
            if(count==2)System.out.println(i);
        }
    }
}
