import javax.swing.*;
import java.awt.event.*;

class Client7 extends JFrame{

	JTextField send;
	JTextField recieve;
	JButton btn;

	Client7(){

		setSize(500,500);
		setLocation(500,300);
		setLayout(null);
		setDefaultCloseOperation(3);

		send=new JTextField();
		recieve=new JTextField();
		btn=new JButton("SEND");

		send.setBounds(20,50,200,30);
		recieve.setBounds(20,110,200,100);
		btn.setBounds(110,250,100,30);

		add(send);
		add(recieve);
		add(btn);

		setVisible(true);

	}

	public static void main(String[] args){
		new Client7();		
	}

}