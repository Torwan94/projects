package BlackJack;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GamePanel extends JPanel {
	
	talia talia;
	Gracz gracz;
	Gracz krupier;
	
	private final Dimension panelsize = new Dimension(600, 400);
	private final Color backgroundColor = Color.GREEN;
	
	PlayerPanel graczpanel;
	PlayerPanel krupierpanel;
	
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
		
		add(graczpanel, BorderLayout.WEST);
		add(krupierpanel, BorderLayout.EAST);
		
		
			
		}

	public void runGame() {
		
		gracz.addKartatorêka(talia.wezjednakarte());
		krupier.addKartatorêka(talia.wezjednakarte());
		gracz.addKartatorêka(talia.wezjednakarte());
		krupier.addKartatorêka(talia.wezjednakarte());
		
		graczpanel.setText(gracz.getHandText(true));
		krupierpanel.setText(krupier.getHandText(false));
		
		
	}
	

}
