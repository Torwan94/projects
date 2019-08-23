package BlackJack;

import java.awt.Toolkit;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Okno extends JFrame {
	
	public Okno() {
		
		setTitle("BLACK JACK by Pawe³ Nawrocki version 0.3");
		setLocation(100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GamePanel gamepanel = new GamePanel();
		getContentPane().add(gamepanel);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("images/ikona.jpg"));
		
		setJMenuBar(new MenuBar(this));
		
		pack();
		setVisible(true);
		
		gamepanel.runGame();
		
	}
	
}
