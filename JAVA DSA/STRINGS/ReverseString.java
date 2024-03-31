package STRINGS;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Sameer";
        String str2="";

        for(char ele : str.toCharArray()){
            str2 = ele +str2;
        }
        System.out.println(str2);
    }
}
