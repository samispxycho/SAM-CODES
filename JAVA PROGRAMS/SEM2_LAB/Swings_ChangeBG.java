package SEM2_LAB;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class Swings_ChangeBG extends JFrame implements ActionListener{

    JButton red;
    JButton green;
    JButton blue;

    Swings_ChangeBG(){
        setSize(500,500);
        setLocation(500,200);
        setLayout(null);
        setDefaultCloseOperation(2);

        red=new JButton("RED");
        green=new JButton("GREEN");
        blue=new JButton("BLUE");

        red.setBounds(20,50,100,30);
        green.setBounds(150,50,100,30);
        blue.setBounds(280,50,100,30);

        add(red);
        add(green);
        add(blue);

        red.setForeground(Color.red);
        green.setForeground(Color.green);
        blue.setForeground(Color.blue);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==red){
            getContentPane().setBackground(Color.RED);
        }else if(ae.getSource()==green){
            getContentPane().setBackground(Color.GREEN);
        }else if(ae.getSource()==blue){
            getContentPane().setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        new Swings_ChangeBG();
    }
}
