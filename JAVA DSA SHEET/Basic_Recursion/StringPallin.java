package Basic_Recursion;

public class StringPallin {

    static boolean stringPallin(String str,int start,int end){
        
        if(start>=end){
            return true;
        }if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        return stringPallin(str, start+1, end-1);

    }

    public static void main(String[] args) {
        
        String str="LuffyffuL";

        int start=0;
        int end=str.length()-1;

        System.out.println(stringPallin(str,start,end));


        /*
        int flag=1;
        while(start<end){
            if(str.charAt(start) != str.charAt(end)){
                System.out.println("Not palindrome");
                flag=0;
                break;
            }
            start++;
            end--;
        }

        if(flag==1)System.out.println("Palindrome String");
        */

    }
}
