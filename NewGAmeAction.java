package BlackJack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class NewGAmeAction implements ActionListener {
	
	JFrame frame;
	
	public NewGAmeAction (JFrame jframe) {
		frame = jframe;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.setVisible(false);
		frame.dispose();
		new Okno();

	}

}
