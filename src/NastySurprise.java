import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JButton button1 = new JButton();
	JButton button2 = new JButton();
public static void main(String[] args) {
	NastySurprise object = new NastySurprise();
object.createUI();
}

void createUI(){
	JFrame frame = new JFrame();
	
	JPanel panel = new JPanel();
	frame.setSize(400, 400);
	button1.setText("Trick");
	button2.setText("Treat");
	panel.add(button1);
panel.add(button2);
frame.add(panel);
	frame.setVisible(true);
	button1.addActionListener(this);

}

private void showPictureFromTheInternet(String imageUrl) {
    try {
         URL url = new URL(imageUrl);
         Icon icon = new ImageIcon(url);
         JLabel imageLabel = new JLabel(icon);
         JFrame frame = new JFrame();
         frame.add(imageLabel);
         frame.setVisible(true);
         frame.pack();
    } catch (MalformedURLException e) {
         e.printStackTrace();
    }
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
if(button1==e.getSource()) {
	showPictureFromTheInternet("https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwjixt3zzJDcAhVFXK0KHfurB3MQjRx6BAgBEAU&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DV08WRasGLG8&psig=AOvVaw0BRJtfg7x7tznCmgkSZDhH&ust=1531176982392161");
}
if(button2==e.getSource()) {
	showPictureFromTheInternet("https://happyologist.co.uk/wp-content/uploads/happy.jpeg");
}
	
}
}
