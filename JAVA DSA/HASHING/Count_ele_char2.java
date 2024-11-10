public class Count_ele_char2 {
    public static void main(String[] args) {
        
        char[]arr=new char[10];
        arr[0]='a';
        arr[1]='v';
        arr[2]='a';
        arr[3]='A';
        arr[4]='s';
        arr[5]='z';
        arr[6]='y';
        arr[7]='k';
        arr[8]='f';
        arr[9]='s';


        int hashChar[]=new int[256];         //new array

        for(char ele : arr){                //when no condition is given-automatically mapping at correct position
            hashChar[ele]++;
        }

        System.out.println("\nCount of s is: "+hashChar['s']);
        System.out.println("Count of A is: "+hashChar['A']);


    }
}
