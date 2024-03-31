package STRINGS;

public class SumOfNumbers {
    public static void main(String[] args) {
        String str = "Sam28e2er5";
        int sum = 0;
        for(char ele : str.toCharArray()){
            if(Character.isDigit(ele)){
                int digit=(int)Character.getNumericValue(ele);
                sum+=digit;
            }
        }
        System.out.println(sum);
    }
}
