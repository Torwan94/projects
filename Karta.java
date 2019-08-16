package BlackJack;

public class Karta {
	private Suit kartaSuit;
	private wartoœci wartosckarty;
	
	public Karta(Suit suit, wartoœci value) {
		kartaSuit = suit;
		wartosckarty = value;
	}
	
	public wartoœci wezwartoœækarty() {
		return wartosckarty;
	}
	
	public Suit wezkolorkarty() {
		return kartaSuit;
	}
	
	public String toString() {
		return wartosckarty.toString() + " " + kartaSuit.toString();
		
	}

}
