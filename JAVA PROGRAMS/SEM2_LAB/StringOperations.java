package SEM2_LAB;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a string number: ");
        String str=sc.nextLine();

        int num=Integer.parseInt(str);
        String str2=String.valueOf(num);

        System.out.println("Number: "+num);
        System.out.println("String: "+str2);

        System.out.print("Enter a string: ");
        String str3=sc.nextLine();

        String lower=str3.toLowerCase();
        String upper=str3.toUpperCase();

        System.out.println("Lower case: "+lower);
        System.out.println("Upper case: "+upper);

        int len=str3.length();
        System.out.println("String length: "+len);

        System.out.print("Enter string to compare: ");
        String toCompare=sc.nextLine();
        int result=str3.compareTo(toCompare);
        System.out.println("After comparision: "+result);

        System.out.println("After replacement: "+str3.replace("Sam", "hahahehe"));

        int vowels=0, conso=0,digits=0;
        str3=str3.toLowerCase();
        for(char ch:str3.toCharArray()){
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vowels++;
                else conso++;
            } else if (Character.isDigit(ch)) {
                digits++;
            }
        }

        System.out.println("Vowels: "+vowels);
        System.out.println("Consonents: "+conso);
        System.out.println("Digits: "+digits);

    }
}
