package SEM2_LAB;
import javax.swing.*;
import java.awt.event.*;

public class Swings_Ques22 extends JFrame implements ActionListener{

    JMenuBar menubar;
    JMenu menu;
    JMenuItem item1;
    JMenuItem item2;

    Swings_Ques22(){
        
        setSize(500,500);
        setLocation(500,300);
        setLayout(null);
        setDefaultCloseOperation(3);

        menubar=new JMenuBar();
        menu=new JMenu("OPTIONS");
        item1=new JMenuItem("open");
        item2=new JMenuItem("save");

        menu.add(item1);
        menu.add(item2);
        menubar.add(menu);
        setJMenuBar(menubar);

        item1.addActionListener(this);
        item2.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        JOptionPane.showMessageDialog(this,ae.getActionCommand()+" Clicked");
    }

    public static void main(String[] args) {
        new Swings_Ques22();
    }
}
