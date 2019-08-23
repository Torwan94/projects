package BlackJack;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
	
	public static void main (String[] args) throws InstantiationException, IllegalAccessException {
		
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
		}
		
		catch (UnsupportedLookAndFeelException e) {
		}
		
		catch (ClassNotFoundException e) {
		}
		
		catch (InstantiationException e) {
		}
		
		catch (IllegalAccessException e) {
		}
		
		new Okno();
	}

}
