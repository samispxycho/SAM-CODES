public class Count_ele_char {
    public static void main(String[] args) {

        char[]arr=new char[10];
        arr[0]='a';
        arr[1]='v';
        arr[2]='a';
        arr[3]='s';
        arr[4]='s';
        arr[5]='z';
        arr[6]='y';
        arr[7]='k';
        arr[8]='f';
        arr[9]='s';


        int hashChar[]=new int[26];         //new array

        for(char ele : arr){                //when the condition is-only lowercase letters
            hashChar[ele-97]++;
        }

        System.out.println("\nCount of s is: "+hashChar['s'-'a']);
        for(int ele:hashChar)System.out.print(ele+" ");

    }
}
