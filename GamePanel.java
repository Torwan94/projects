package BlackJack;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GamePanel extends JPanel {
	
	private talia talia;
	private Gracz gracz;
	private Gracz krupier;
	
	private final Dimension panelsize = new Dimension(600, 400);
	private final Color backgroundColor = Color.green;
	
	private PlayerPanel graczpanel;
	private PlayerPanel krupierpanel;
	public talia getTalia() {
		return talia;
	}

	private Component lowerPanel;
	
	public GamePanel() {
		
		talia = new talia();
		talia.wymieszaj();
		gracz = new Gracz("Ty");
		krupier = new Gracz("Krupier");
		
		setPreferredSize(panelsize);
		setBackground(backgroundColor);
		setLayout(new BorderLayout());
		
		graczpanel = new PlayerPanel(300,150);
		krupierpanel = new PlayerPanel(300,150);
		lowerPanel = new DolnePrzyciski(600,50, this);
		
		add(graczpanel, BorderLayout.WEST);
		add(krupierpanel, BorderLayout.EAST);
		add(lowerPanel, BorderLayout.SOUTH);
		
		
			
		}

	public void runGame() {
		
		gracz.addKartatorêka(talia.wezjednakarte());
		krupier.addKartatorêka(talia.wezjednakarte());
		gracz.addKartatorêka(talia.wezjednakarte());
		krupier.addKartatorêka(talia.wezjednakarte());
		
		graczpanel.setText(gracz.getCardsOnHand(true));
		krupierpanel.setText(krupier.getCardsOnHand(false));
		
	}
	
	public void doturakrupiera() {
		
		boolean krupierinGame = true;
		
		while(krupierinGame) {
			if(krupier.getsumarêki() < 17) {
			
			krupier.addKartatorêka(talia.wezjednakarte());
			krupierinGame = !krupier.checkIfBusted();
			krupierpanel.setText(krupier.getCardsOnHand(false));
		} else {
			krupierinGame = false;
		}
		}
	}
	
	public void finishGame() {
		
		((DolnePrzyciski) lowerPanel).disableButtons();
		
		int sumagracza = gracz.getsumarêki();
		int sumakrupiera = krupier.getsumarêki();
		
		if (sumagracza > sumakrupiera && sumagracza <= 21 || sumakrupiera > 21) {
			graczpanel.setWinnerLabelText("<html> <b> WYGRANA!!! </B> </html>");
		} else {
			krupierpanel.setWinnerLabelText("<html> <b> Krupier wygra³ :-( </b> </html>");
		}
		
		graczpanel.setText(gracz.getCardsOnHand(true));
		krupierpanel.setText(krupier.getCardsOnHand(true));
		
	}
	
	public void setTalia(talia talia) {
		this.talia = talia;
	}

	public Gracz getGracz() {
		return gracz;
	}

	public void setGracz(Gracz gracz) {
		this.gracz = gracz;
	}

	public Gracz getKrupier() {
		return krupier;
	}

	public void setKrupier(Gracz krupier) {
		this.krupier = krupier;
	}

	public PlayerPanel getGraczpanel() {
		return graczpanel;
	}

	public void setGraczpanel(PlayerPanel graczpanel) {
		this.graczpanel = graczpanel;
	}

	public PlayerPanel getKrupierpanel() {
		return krupierpanel;
	}

	public void setKrupierpanel(PlayerPanel krupierpanel) {
		this.krupierpanel = krupierpanel;
	}

	public Component getLowerPanel() {
		return lowerPanel;
	}

	public void setLowerPanel(Component lowerPanel) {
		this.lowerPanel = lowerPanel;
	}

}
