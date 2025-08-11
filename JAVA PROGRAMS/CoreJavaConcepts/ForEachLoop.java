public class ForEachLoop {
    public static void main(String[] args) {
        int[] marks = new int[10];
        marks[0] = 00;
        marks[1] = 10;
        marks[2] = 20;
        marks[3] = 30;
        marks[4] = 40;
        marks[5] = 50;
        marks[6] = 60;
        marks[7] = 70;
        marks[8] = 80;
        marks[9] = 90;

        /*
            for(int i=0;i<marks.length;i++)
            {
                System.out.printf("The value at index %d is %d\n",i,marks[i]);
            }
         */

        // OR WE CAN USE FOR-EACH LOOP TO MAKE OUR DOCUMENT LOOK FORMATTED

        for (int element : marks) {
            System.out.println(element);
        }

    }
}
