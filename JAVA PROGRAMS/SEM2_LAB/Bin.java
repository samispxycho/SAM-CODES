package SEM2_LAB;
import java.awt.*;

public class Bin extends Frame{

    Bin(){
        setSize(500,500);
        setVisible(true);
    }

    public void paint(Graphics g){
        g.drawString("AWT JAVA",250,250);
    }

    public static void main(String[] args) {
        new Bin();
    }
}