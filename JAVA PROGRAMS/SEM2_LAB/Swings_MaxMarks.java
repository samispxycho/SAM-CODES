package SEM2_LAB;
import javax.swing.*;
import java.awt.event.*;

public class Swings_MaxMarks extends JFrame implements ActionListener{

    JTextField maxMarks;
    JTextField marksObtained;
    JButton grade;
    JTextField display;

    Swings_MaxMarks(){

        setSize(500,500);
        setLocation(500,300);
        setLayout(null);
        setDefaultCloseOperation(3);

        maxMarks=new JTextField();
        marksObtained=new JTextField();
        grade=new JButton("Calculate Grade");
        display=new JTextField();

        maxMarks.setBounds(20,50,100,30);
        marksObtained.setBounds(150,50,100,30);
        grade.setBounds(50,130,200,30);
        display.setBounds(50,200,100,30);

        add(maxMarks);
        add(marksObtained);
        add(grade);
        add(display);

        grade.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

        int Maximum_marks=Integer.parseInt(maxMarks.getText());
        int Marks_obtained=Integer.parseInt(marksObtained.getText());

        if(Marks_obtained > Maximum_marks){
            JOptionPane.showMessageDialog(this,"Marks obtained greater than max Marks");
        }else{
            double percentage = ((double) Marks_obtained / Maximum_marks) * 100;
            display.setText("Percentage: " + String.valueOf(percentage));
        }
    }

    public static void main(String[] args) {
        new Swings_MaxMarks();
    }
}
