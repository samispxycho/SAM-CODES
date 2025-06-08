package SEM2_LAB;
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

public class Swings_ColorShape extends JFrame implements ActionListener{

    JButton red;
    JButton blue;
    JButton line;
    JButton circle;

    Integer flag=null;
    Color selectedColor=null;

    Swings_ColorShape(){

        setSize(500,500);
        setLocation(500,300);
        setLayout(null);
        setDefaultCloseOperation(2);

        red=new JButton("RED");
        blue=new JButton("BLUE");
        line=new JButton("LINE");
        circle=new JButton("CIRCLE");

        red.setBounds(20,50,100,30);
        blue.setBounds(150,50,100,30);
        line.setBounds(20,110,100,30);
        circle.setBounds(150,110,100,30);

        add(red);
        add(blue);
        add(line);
        add(circle);

        red.addActionListener(this);
        blue.addActionListener(this);
        line.addActionListener(this);
        circle.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==red)selectedColor=Color.RED;
        if(ae.getSource()==blue)selectedColor=Color.BLUE;
        if(ae.getSource()==line)flag=1;
        if(ae.getSource()==circle)flag=0;

        repaint();
    }

    public void paint(Graphics g){
        super.paint(g);
        if(selectedColor!=null){
            g.setColor(selectedColor);
        }
        if(flag==1){
            g.drawLine(300,300,450,450);
        }
        if(flag==0){
            g.drawOval(300,300, 100, 100);
        }
    }

    public static void main(String[] args) {
        new Swings_ColorShape();
    }
}
