public class ArrayLength {
    public static void main(String[] args) {

        int[]marks=new int [10];
        marks[0]=00;
        marks[1]=10;
        marks[2]=20;
        marks[3]=30;
        marks[4]=40;
        marks[5]=50;
        marks[6]=60;
        marks[7]=70;
        marks[8]=80;
        marks[9]=90;

        //We can calculate the length of an array using .length function
        System.out.println(marks.length);

        //OR
        int len=marks.length;
        System.out.println(len);
        
    }
}
