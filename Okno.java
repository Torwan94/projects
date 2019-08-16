package BlackJack;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Okno extends JFrame {
	
	public Okno() {
		
		setTitle("BLACK JACK by Pawe³ Nawrocki");
		setLocation(100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GamePanel gamepanel = new GamePanel();
		getContentPane().add(gamepanel);
		
		
		pack();
		setVisible(true);
		
		gamepanel.runGame();
		
	}
	
}
