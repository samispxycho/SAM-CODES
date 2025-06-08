package SEM2_LAB;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;

public class Swings_MouseXY extends JFrame implements MouseMotionListener{

    int x,y;

    Swings_MouseXY(){

        setSize(500,500);
        setLocation(500,300);
        setLayout(null);
        setDefaultCloseOperation(2);

        this.addMouseMotionListener(this);

        setVisible(true);

    }

    public void mouseMoved(MouseEvent me){
        x=me.getX();
        y=me.getY();
        repaint();
    }

    public void mouseDragged(MouseEvent me){}

    public void paint(Graphics g){
        super.paint(g);
        g.drawString("x: "+x+" y: "+y, 10,480);
    }

    public static void main(String[] args) {
        new Swings_MouseXY();
    }
}
