import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        
        //Declaring a hashmap
        HashMap<String,Integer> fuel=new HashMap<>();

        //To insert values
        fuel.put("CNG",70);
        fuel.put("Diesal",80);
        fuel.put("Petrol",90);
        System.out.println(fuel);

        //Printing using for each loop
        for(Map.Entry<String,Integer> e: fuel.entrySet())
        {
            System.out.print(e.getKey());
            System.out.println(e.getValue());
        }

       //To check whether a particular key exists
       System.out.println(fuel.containsKey("China"));

        //To check whether a particular value exists
        System.out.println(fuel.containsValue(90));

        //To remove a hash set
        fuel.remove("CNG");
        System.out.println(fuel);
        
    }
}
