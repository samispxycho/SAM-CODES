package STRINGS;

public class FirstAndLast {
    public static void main(String[] args) {
        String str = "graphic era university";
        String [] arr = str.split(" ");

        for(String ele : arr){
            for(char e : ele.toCharArray()){
                Character.toUpperCase(e);
            }
        }




    }
}
