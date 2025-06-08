package SEM2_LAB;
import javax.swing.*;
import java.awt.event.*;

public class Swings_Textbox extends JFrame implements ActionListener{

    JTextField tf;
    JButton btn;
    JLabel label;

    Swings_Textbox(){
        setSize(500,500);
        setLocation(500,200);
        setLayout(null);
        setDefaultCloseOperation(2);

        tf=new JTextField();
        btn=new JButton("PRESS");
        label=new JLabel();

        tf.setBounds(20,50,200,30);
        btn.setBounds(250,50,100,30);
        label.setBounds(20,80,200,30);

        add(tf);
        add(btn);
        add(label);

        btn.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        label.setText(tf.getText());
    }

    public static void main(String[] args) {
        new Swings_Textbox();
    }
}
