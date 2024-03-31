package STRINGS;

public class Pallin {
    public static void main(String[] args) {
        String str1 = "samemas";
        char[] arr=str1.toCharArray();

        int start=0;
        int end=arr.length-1;

        boolean check=true;
        while(start<end){
            if(arr[start]!=arr[end]){
                check=false;
                break;
            }
            start++;end--;
        }
        if(check==true)System.out.println("Pallindrome string");
        else System.out.println("Not pallindrome");

    }
}
