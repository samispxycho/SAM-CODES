package Strings;

public class Password {
    public static void main(String[] args) {

        String str1 = "hackerrank";
        String str2 = "mountain";
        StringBuilder result = new StringBuilder();

        int i = 0;
        int j = 0;
        while(i<str1.length() && j<str2.length()){
            result.append(str1.charAt(i++));
            result.append(str2.charAt(j++));
        }

        while(i<str1.length()){
            result.append(str1.charAt(i++));
        }

        while(j<str2.length()){
            result.append(str2.charAt(j++));
        }

        System.out.println(result.toString());
    }
}
