public class Ques25 {
    public static void main(String[] args) {
        int max=0;
        int [] arr={150,100,200,300,250,350,450,300,500,400};
        for(int element:arr)
        {
            if(element>element-1)
            {
               max=element;
            }
        }
        System.out.println(max);
    }
}
