package BlackJack;

public class Karta {
	private Suit kartaSuit;
	private warto�ci wartosckarty;
	
	public Karta(Suit suit, warto�ci value) {
		kartaSuit = suit;
		wartosckarty = value;
	}
	
	public warto�ci wezwarto��karty() {
		return wartosckarty;
	}
	
	public Suit wezkolorkarty() {
		return kartaSuit;
	}
	
	public String toString() {
		return wartosckarty.toString() + " " + kartaSuit.toString();
		
	}

}
