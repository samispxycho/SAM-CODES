package Problems_On_Arrays;

public class RobotCircular {

    static String checkCircular(String s) {
        int x = 0, y = 0, dir = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'G') {
                if (dir == 0)
                    x++;
                else if (dir == 1)
                    y--;
                else if (dir == 2)
                    x--;
                else
                    y++;
            } else if (ch == 'L') {
                dir = (dir + 3) % 4;
            } else {
                dir = (dir + 1) % 4;
            }
        }
        if (x == 0 && y == 0)
            return "Circular";
        else
            return "Not Circular";
    }

    public static void main(String[] args) {
        String s = "GLGLGLG";
        System.out.println(checkCircular(s));
    }
}
