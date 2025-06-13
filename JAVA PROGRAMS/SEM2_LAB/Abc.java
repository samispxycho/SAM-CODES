package SEM2_LAB;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Graphics;
;

public class Abc extends JFrame implements MouseListener{

    Integer x1=null;
    Integer x2=null;
    Integer y1=null;
    Integer y2=null;
    boolean flag=true;

    Abc(){

        setSize(500,500);
        setLocation(500,300);
        setLayout(null);
        setDefaultCloseOperation(3);

        this.addMouseListener(this);

        setVisible(true);
    }

    public void mouseClicked(MouseEvent me){

        if(flag){
            x1=me.getX();
            y1=me.getY();
        }else{
            x2=me.getX();
            y2=me.getY();
        }

        flag=!flag;
        repaint();
    }

    public void paint(Graphics g){
        super.paint(g);
        if(x1!=null && x2!=null){
            g.drawLine(x1, y1, x2, y2);
        }
    }

    public void mouseEntered(MouseEvent me){}
    public void mouseExited(MouseEvent me){}
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}

    public static void main(String[] args) {
        new Abc();
    }
}
