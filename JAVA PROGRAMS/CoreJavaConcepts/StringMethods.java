public class StringMethods {
    public static void main(String[] args)
    {
       String name="SamEerUpADhyay";
       System.out.println("Name of the string: "+name);

                    //STRING METHODS/FUNCTIONS

        //To calculate the length of the string
        int size=name.length();
        System.out.println("Size of the string is: "+size);

        //To covert all the uppercase letters to lowercase
        String low=name.toLowerCase();
        System.out.println("String in lowercase: "+low);

        //To convert all the lowercase letters to uppercase
        String up=name.toUpperCase();
        System.out.println("String in uppercase: "+up);

        //To trim the leading and the trailing spaces
        String trimming="       SamEerUpADhyay       ";
        System.out.println("After trimming: "+trimming.trim());

        //Substring by using only starting index
        String subs=name.substring(3);
        System.out.println("SubString is: "+subs);

        //Substring by using starting and ending index
        String sub=name.substring(3,8);
        System.out.println("Substring: "+sub);

        //To replace two alphabets
        String rep=name.replace('S','u');
        System.out.println("After replacing: "+rep);

        //To replace two substrings
        String rep2=name.replace("Sam","uPA");
        System.out.println("After replacing: "+rep2);

        //To check whether a string starts with a particular string
        boolean start=name.startsWith("Sam");
        System.out.println(start);

        //To check whether a string ends with a particular string
        boolean end=name.endsWith("lol");
        System.out.println(end);

        //To return the character at a particular position
        char at=name.charAt(3);
        System.out.println("Character at position 3 is: "+at);

        //To return the index of a particular character or substring
        int in=name.indexOf("yay");
        System.out.println("Position of the substring Sam is: "+in);

        //To check if a string is mathched or not
        boolean see=name.equals("SamEerUpADhyay");
        System.out.println(see);

        //To check if a string is matched but ignoring the case sensitivity
        boolean see2=name.equalsIgnoreCase("sameerupadhyay");
        System.out.println(see2);
    }
}
