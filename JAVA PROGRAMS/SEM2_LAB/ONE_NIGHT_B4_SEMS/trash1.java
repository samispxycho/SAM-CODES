package SEM2_LAB.ONE_NIGHT_B4_SEMS;

public class trash1 {
    public static void main(String[] args) {
        String str="he12llo34";
        int sum=0;

        int index=0;
        while(index<str.length()){
            char c=str.charAt(index);
            if(Character.isDigit(c)){
                sum=sum+Character.getNumericValue(c);
            }
            index+=1;
        }

        System.out.println(sum);

    }
}
