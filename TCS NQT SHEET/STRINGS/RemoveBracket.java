package STRINGS;

public class RemoveBracket {
    public static void main(String[] args) {
        String str = "a+((b-c)+d)";
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) != '(' && str.charAt(i) != ')')sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
