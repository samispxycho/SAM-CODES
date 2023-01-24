import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Frames extends Frame implements ActionListener{
    Frames()
    {
        //Creating a default frame
        this.setVisible(true);
        this.setTitle("My Frame");
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        //Creating and adding buttons
        Button b1=new Button();
        b1.setLabel("Red");
        b1.setBounds(100,100,500,500);
        b1.setBackground(Color.RED);
        b1.addActionListener(this);
        this.add(b1);

        //2nd button
        Button b2=new Button();
        b2.setLabel("Blue");
        b2.setBounds(100,100,500,500);
        b2.setBackground(Color.BLUE);
        b2.addActionListener(this);
        this.add(b2);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String label=ae.getActionCommand();
        if(label.equals("Red"))
        {
            this.setBackground(Color.RED);
        }
        if(label.equals("Blue"))
        {
            this.setBackground(Color.BLUE);
        }
    }
    public static void main(String[] args) {
        Frames obj=new Frames();
    }
}
