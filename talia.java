package BlackJack;

import java.util.ArrayList;
import java.util.Collections;

public class talia {
	
	private ArrayList<Karta> karty;
	
	public talia() {
		karty = new ArrayList<>();
		
		for (int suit = 0; suit < 4; suit++) {
			for(int value = 0; value < 13; value++) {
				
			karty.add(new Karta(Suit.values()[suit], wartoœci.values()[value]));
			
		}
	}

}
	public void wymieszaj() {
		Collections.shuffle(karty);	
	}
	
	public Karta wezjednakarte() {
		return karty.remove(0);
	}
}
