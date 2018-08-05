import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	public static void main(String[] args) {
		WhackAMole test = new WhackAMole();
	}
JFrame frame = new JFrame();
JPanel panel = new JPanel();

JLabel label = new JLabel();


WhackAMole(){
	//frame.setSize(300, 300);
frame.setPreferredSize(new Dimension(300,300));
	label.setText("Whack A Button For Fame And Glory");
	frame.add(label);
	frame.add(panel);
	frame.setVisible(true);
	Random gen = new Random();
	drawButtons(gen.nextInt(9));
	frame.pack();
	
}

void drawButtons(int number){
	for (int i = 0; i < 9; i++) {
		JButton button;
		if(i==number) {
			button=new JButton("mole!");
			
		}
		else {
			button=new JButton();
			
		}
		button.addActionListener(this);
		panel.add(button);
		
	}
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton ButtonPressed = (JButton) e.getSource();
	if(ButtonPressed.getText().equals("mole!")) {
		speak("You missed");
		playSound("creepy-noise.wav");
		}
	}


void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
    }
}

private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
}
}
