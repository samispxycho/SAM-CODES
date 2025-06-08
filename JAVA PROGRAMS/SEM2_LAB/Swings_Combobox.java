package SEM2_LAB;
import javax.swing.*;
import java.awt.event.*;

public class Swings_Combobox extends JFrame implements ItemListener{

    String colours[]={"SELECT","red","green","blue","pink","purple","black"};
    JComboBox<String>cb;

    Swings_Combobox(){

        setSize(500,500);
        setLocation(500,300);
        setLayout(null);
        setDefaultCloseOperation(3);

        cb=new JComboBox<>(colours);
        cb.setBounds(20,50,200,30);
        add(cb);

        cb.addItemListener(this);

        setVisible(true);
    }

    public void itemStateChanged(ItemEvent ie){
        if(ie.getStateChange()==ItemEvent.SELECTED && !ie.getItem().equals("SELECT")){
            System.out.println("Item selected");
        }
    }

    public static void main(String[] args) {
        new Swings_Combobox();
    } 
}