package STRINGS;

public class VowelConso {
    public static void main(String[] args) {
        String str ="Graphic Era 15Univ6ersity Dehradun";
        str = str.toLowerCase();

        int vowel=0;
        int conso=0;
        int white=0;
        int digit=0;

        for(char ele:str.toCharArray()){
            if(ele==' ')white++;
            else if(Character.isDigit(ele))digit++;
            else if(ele=='a' || ele=='e' || ele=='i' || ele=='o'||ele=='u')vowel++;
            else conso++;
        }
        System.out.println("Consonents: "+conso);
        System.out.println("Digits: "+digit);
        System.out.println("Vowels: "+vowel);
        System.out.println("whitespace: "+white);
    }
}
