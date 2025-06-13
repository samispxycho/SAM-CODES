package SEM2_LAB.ONE_NIGHT_B4_SEMS;
import javax.swing.*;
import java.awt.event.*;

public class trash4 extends JFrame implements MouseListener{

    Integer x=null;
    Integer y=null;
    JLabel label;

    trash4(){
        setSize(500,500);
        setLocation(500,300);
        setLayout(null);
        setDefaultCloseOperation(3);

        label=new JLabel();
        label.setBounds(10,10,200,30);
        add(label);

        this.addMouseListener(this);

        setVisible(true);
    }

    public void mouseClicked(MouseEvent me){

        x=me.getX();
        y=me.getY();

        label.setText(x+" "+y);

    }
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me){}
    public void mouseExited(MouseEvent me){}

    public static void main(String[] args) {
        new trash4();
    }
}
