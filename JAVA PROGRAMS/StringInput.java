import java.util.Scanner;

public class StringInput {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        //To read a single alphabet from the user
        System.out.println("Enter a single alphabet");
        String single=sc.next();
        System.out.println(single);

        //Similarly to read a single word from the user
        System.out.println("Write a word");
        String word=sc.next();
        System.out.println(word);

        //To read a whole sentence from the user
        System.out.println("Write a secntence");
        String sentence=sc.nextLine();
        System.out.println(sentence);

        sc.close();
    }
}
