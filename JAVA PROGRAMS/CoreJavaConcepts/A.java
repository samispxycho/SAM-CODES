import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A extends Frame implements ActionListener
{
    A()
    {
        this.setVisible(true);
        this.setTitle("My Frame");
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setBackground(Color.black);

        Button b1=new Button();
        b1.setLabel("Red");
        b1.setBounds(100,100,300,300);
        b1.setBackground(Color.red);
        b1.addActionListener(this);
        this.add(b1);

        Button b2 =new Button();
        b2.setLabel("Blue");
        b2.setBounds(100, 100, 300, 300);
        b2.setBackground(Color.blue);
        b2.addActionListener(this);
        this.add(b2);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String str=ae.getActionCommand();
        if(str.equals("Red"))
        {
            this.setBackground(Color.red);
        }
        if(str.equals("Blue"))
        {
            this.setBackground(Color.blue);
        }
    }
    public static void main(String[] args) {
        A obj=new A();
    }
}