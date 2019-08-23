package BlackJack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AkcjePrzyciskow implements ActionListener {
	
	private GamePanel game;
	boolean playerInGame = true;
	
	public AkcjePrzyciskow(GamePanel game) {
		this.game = game;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		game.getGracz() .addKartatorêka(game.getTalia() .wezjednakarte());
		playerInGame = !game.getGracz() .checkIfBusted();
		game.getGraczpanel() .setText(game.getGracz() .getCardsOnHand(true));
		
		if (!playerInGame) {
			game.finishGame();
		}
	}

}
