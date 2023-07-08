package Collection;
import java.util.ArrayList;
//import java.util.Iterator;
import java.util.Iterator;

public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>(); 
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);  
        
        ArrayList<Integer>al2=new ArrayList<>();
        al2.add(400);
        al2.add(500);
        al2.add(600);
        al2.add(700);
        al2.add(800);
        
        /*
        //Four ways to print elements of an arraylist

        System.out.println(al);

        int a=al.get(3);
        System.out.println(a);

        Iterator<Integer> itr=al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        

        for(int ele:al){
            System.out.println(ele);
        }

        */

        al.add(5, 600);
        System.out.println(al);

        al.addAll(al2);
        System.out.println(al);

        al.remove(5);
        System.out.println(al);

        al.removeAll(al2);
        System.out.println(al);

        al2.clear();
        System.out.println(al2);

        System.out.println(al.contains(300));
        System.out.println(al.contains(700));

        System.out.println(al.size());

        al.set(2,800);
        System.out.println(al);

        System.out.println(al.indexOf(200));

        Iterator <Integer> itr=al.iterator();
        int[] arr=new int[al.size()];

        int i=0;
        while(itr.hasNext()){
            arr[i]=(int)itr.next();
            i++;
        }

        for (int ele:arr){
            System.out.print(ele+" ");
        }


    }
}
