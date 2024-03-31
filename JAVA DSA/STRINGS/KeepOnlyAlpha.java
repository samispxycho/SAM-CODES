package STRINGS;

public class KeepOnlyAlpha {
    public static void main(String[] args) {
        String str = "take12% *&u ^$#forward";
        StringBuilder sb = new StringBuilder();

        for(char ele : str.toCharArray()){
            if(Character.isAlphabetic(ele)) sb.append(ele);
        }

        System.out.println(sb.toString());


    }
}
