package Collection;
//import java.util.Map;
//import java.util.HashMap;
//import java.util.Set;
//import java.util.Iterator;

public class HashMapp {
    public static void main(String[] args) {

        /*
        HashMap <Integer,String> map=new HashMap <> ();
		
		map.put(101,"Sameer");
		map.put(102,"Aakash");
		map.put(103,"Kaushal");
		map.put(104,"Khalid");
		map.put(105,"Prabhjyot");
		
		HashMap <Integer,String> hm=new HashMap <> ();
		hm.put(106,"Sameer");
		hm.put(107,"Aakash");
		hm.put(108,"Kaushal");
		
		System.out.println(map);
		System.out.println(hm);
		map.putAll(hm);
		System.out.println(map);
		
		System.out.println(map.size());
		
		hm.replace(107,"Khalid");
		System.out.println(hm);
		
		System.out.println(hm.isEmpty());
		
		System.out.println(map.get(101));

        System.out.println(map.containsKey(101));	
        System.out.println(map.containsValue("Sameer"));
        
        hm.remove(107);
        System.out.println(hm);
		
		hm.clear();
		System.out.println(hm);
		*/

		//Ways to iterate elements one by one
		
		/*
		//Converting into set and then using Iterator to it
		Set set=map.entrySet();
		System.out.println(set);
		
		Iterator itr=set.iterator();
		while(itr.hasNext()){
		    Map.Entry entry= (Map.Entry) itr.next();
		    System.out.println(entry.getKey()+"---> "+entry.getValue());
		}
		*/
		
		
		/*
		//Using for each way in a complex way
		Set set=map.entrySet();
		System.out.println(set);
		
		for(Object ele:set){
		    Map.Entry entry=(Map.Entry) ele;
		    System.out.println(entry.getKey()+" ---> "+entry.getValue());
		}
		*/
		
		/*
		//Using for each in an effective way
		for(Map.Entry entry:map.entrySet()){
		    System.out.println(entry.getKey()+" ---> "+entry.getValue());
		}
		*/
    }
}
