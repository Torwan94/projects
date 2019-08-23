package BlackJack;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class DolnePrzyciski extends JPanel {
	
	private JButton takeCardButton = new JButton("Dobierz kartê");
	private JButton passButton = new JButton("Pas");
	private final Color backgroundColor = Color.white;
	
	public DolnePrzyciski(int w, int h, GamePanel game) {
		setPreferredSize(new Dimension(w,h));
		setBorder(new EmptyBorder(10, 10, 10, 10));
		takeCardButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		passButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		takeCardButton.addActionListener(new AkcjePrzyciskow(game));
		passButton.addActionListener(new PrzyciskPas(game));
		
		add(takeCardButton);
		add(passButton);
		
		
	}
	
	public void disableButtons() {
		takeCardButton.setEnabled(false);
		passButton.setEnabled(false);
	}
	
	

}
