package BlackJack;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MenuBar extends JMenuBar {
	
	JFrame frame;
	JMenu menu;
	JMenuItem newGameMenuItem;
	JMenuItem quitGameMenuItem;
	
	public MenuBar(JFrame jframe) {
		
		frame = jframe;
		
		menu = new JMenu("Menu");
		add(menu);
		
		newGameMenuItem = new JMenuItem("Nowa gra");
		newGameMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		newGameMenuItem.addActionListener(new NewGAmeAction(frame));
		menu.add(newGameMenuItem);
		
		quitGameMenuItem = new JMenuItem("Wyjdz z gry");
		quitGameMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
		quitGameMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		menu.add(quitGameMenuItem);
	}

}
