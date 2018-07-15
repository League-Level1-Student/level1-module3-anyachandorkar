import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	
	JButton button1 = new JButton();
JButton button2 = new JButton();
	
public static void main(String[] args) {
	ChuckleClicker test = new ChuckleClicker();
	test.makeButtons();
}

void makeButtons() {

JFrame frame = new JFrame();
frame.resize(200, 200);
JPanel panel = new JPanel();

button1.setText("joke");
button2.setText("punchline");

button1.addActionListener(this);
button2.addActionListener(this);

panel.add(button1);
panel.add(button2);
frame.add(panel);
frame.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(button1 == e.getSource()) {
		JOptionPane.showMessageDialog(null, "Why did the mushroom go to the party?");
	}
	if(button2 == e.getSource()) {
		JOptionPane.showMessageDialog(null, "Because he was a fungi");
	}
}}
