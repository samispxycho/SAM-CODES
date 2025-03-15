package SEM2_LAB;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Count_Occurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine().toUpperCase();
        sc.close();

        Map<Character,Integer>map=new LinkedHashMap<>();

        for(char ele:str.toCharArray()){
            if(!map.containsKey(ele)){
                map.put(ele,1);
            }else{
                map.put(ele,map.get(ele)+1);
            }
        }

        map.forEach((key, value) -> {
            if (key != ' ') {
                System.out.println(key + " -> " + value);
            }
        });
    }
}
