public class trash {
    public static void main(String[] args) {
        int num = 123454321;
        int num1 = num;
        int rev = 0;
        while(num>0){
            int d = num%10;
            rev = (rev*10)+d;
            num/=10;
        }
        if(num1 == rev)System.out.println("Pallindrome");
        else System.out.println("Not pallindrome");
    }
}
