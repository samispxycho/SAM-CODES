package SEM2_LAB;
import javax.swing.*;
import java.awt.event.*;
import java.lang.reflect.Method;

public class Swings_Ques21 extends JFrame implements ItemListener{
 
    JCheckBox java;
    JCheckBox python;
    JRadioButton male;
    JRadioButton female;
    JTextField tf;

    Swings_Ques21(){

        setSize(500,500);
        setLocation(500,300);
        setLayout(null);
        setDefaultCloseOperation(3);

        java=new JCheckBox("JAVA");
        python=new JCheckBox("PYTHON");
        male=new JRadioButton("MALE");
        female=new JRadioButton("FEMALE");
        tf=new JTextField();

        java.setBounds(20,50,100,30);
        python.setBounds(150,50,100,30);
        male.setBounds(20,110,100,30);
        female.setBounds(150,110,100,30);
        tf.setBounds(120,180,200,30);

        ButtonGroup gender=new ButtonGroup();
        gender.add(male);
        gender.add(female);

        add(java);
        add(python);
        add(male);
        add(female);
        add(tf);

        java.addItemListener(this);
        python.addItemListener(this);
        male.addItemListener(this);
        female.addItemListener(this);

        setVisible(true);
    }

    public void itemStateChanged(ItemEvent ie){
        AbstractButton b=(AbstractButton)ie.getItem();
        if(ie.getStateChange()==ItemEvent.SELECTED){
            tf.setText(b.getText()+" Clicked");
        }
    }

    public static void main(String[] args) {
        new Swings_Ques21();
    }
}
