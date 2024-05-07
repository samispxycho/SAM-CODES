package RECURSION;

public class PallinStrR {

    static boolean method(String str,int start,int end){

        if(start>end)return true;

        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }

        return method(str,start+1,end-1);
    }

    public static void main(String[] args) {
        String str="madam";
        int length=str.length();

        System.out.println(method(str, 0, length-1));
    }
}
