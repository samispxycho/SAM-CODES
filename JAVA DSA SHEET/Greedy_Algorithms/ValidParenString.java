package Greedy_Algorithms;

//View DP solution as well
public class ValidParenString {
    public static boolean checkValidString(String s){

        int minOpen=0;
        int maxOpen=0;

        for(char ch:s.toCharArray()){

            if(ch=='('){
                minOpen+=1;
                maxOpen+=1;
            }else if(ch==')'){
                minOpen-=1;
                maxOpen-=1;
            }else{
                minOpen-=1;
                maxOpen+=1;
            }

            if(maxOpen<0)return false;
            if(minOpen<0)minOpen=0;
        }

        return minOpen==0;
    }

    public static void main(String[] args) {
        String s = "(*))";
        System.out.println(checkValidString(s));
    }
}