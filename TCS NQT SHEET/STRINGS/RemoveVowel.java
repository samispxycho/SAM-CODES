package STRINGS;

public class RemoveVowel {
    public static void main(String[] args) {
        String str = "graphicerauniversity";
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u' )
                sb.append(str.charAt(i));
        }

        System.out.println("Sentence without vowels: "+sb);
    }
}
