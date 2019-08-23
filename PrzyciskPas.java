package BlackJack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrzyciskPas implements ActionListener  {
	
	private GamePanel game;
	
	public PrzyciskPas(GamePanel game) {
		this.game = game;
	}
	
	public void actionPerformed(ActionEvent e) {
		game.doturakrupiera();
		game.finishGame();
	}

}
