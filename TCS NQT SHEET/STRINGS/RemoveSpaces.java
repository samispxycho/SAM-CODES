package STRINGS;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "gra phic era univer sity dehr adun";
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){
            if(!Character.isWhitespace(str.charAt(i)))sb.append(str.charAt(i));
        }
        System.out.println(sb);

    }
}
