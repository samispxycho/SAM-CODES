package NUMBERS;

public class AP {
    public static void main(String[] args) {
        int start = 2;
        int diff = 2;
        int term = 4;

        int sum=0;
        for(int i=1;i<=term;i++){
            sum+=start;
            start+=diff;
        }
        System.out.println(sum);
    }
}
