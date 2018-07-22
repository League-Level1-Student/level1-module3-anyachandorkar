import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
//hello
public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
JTextField text = new JTextField(10);
JTextField text1 = new JTextField(10);
	
Calculator(){
	frame.add(panel);
	panel.add(text);
	panel.add(text1);

	button1.setText("add");
	button2.setText("subtract");
	button3.setText("multiply");
	button4.setText("divide");
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);

	frame.setVisible(true);
	frame.pack();
}
	
int add(int a, int b) {
	return a+b;
}

int subtract(int a, int b) {
return a-b;
}

int multiply(int a, int b) {
	return a*b;
}

int divide(int a, int b) {
	return a/b;
}

@Override
public void actionPerformed(ActionEvent e) {
	String a = text.getText();
		int x = Integer.parseInt(a);
		String b = text1.getText();
		int y = Integer.parseInt(b);
	
	// TODO Auto-generated method stub
	if(e.getSource()==button1) {
		add(x,y);
	}
	
	if(e.getSource()==button2) {
		subtract(x,y);
	}
	
	if(e.getSource()==button3) {
		multiply(x,y);
	}
	
	if(e.getSource()==button4) {
		divide(x,y);
	}
}
}
