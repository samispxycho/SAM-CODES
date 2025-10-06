package Greedy_Algorithms;

public class LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int ele : bills) {

            if (ele == 5) {
                five += 1;
            } else if (ele == 10) {
                if (five > 0) {
                    five -= 1;
                    ten += 1;
                } else {
                    return false;
                }
            } else {
                if (ten >= 1 && five >= 1) {
                    ten -= 1;
                    five -= 1;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] bills = { 5, 5, 5, 10, 20 };
        System.out.println(lemonadeChange(bills));
    }

}