package BlackJack;

import java.util.ArrayList;

public class Gracz {
	
	private String imi�;
	private ArrayList<Karta> r�ka;
	
	public Gracz (String imi�gracza) {
		r�ka = new ArrayList<>();
		imi� = imi�gracza;
	}
	
	public String getName() {
		return imi�;
	}
	
	public void addKartator�ka (Karta newKarta) {
		r�ka.add(newKarta);
	}
	
	public int getsumar�ki() {
		int sumapunkt�w = 0;
		int punktykarty;
		int ilo��as�w = 0;
		
		for(int a = 0; a < r�ka.size(); a++) {
			punktykarty = r�ka.get(a) .wezwarto��karty(). getwarto�ci();
			
			if (punktykarty == 11) {
				ilo��as�w++;
				sumapunkt�w += 11;
				
			} else {
				sumapunkt�w += punktykarty;
			}
			
			while (sumapunkt�w > 21 && ilo��as�w > 0) {
				sumapunkt�w -= 10;
				ilo��as�w --;
				
			}
			
		}
		return sumapunkt�w;
	}
	
	public String getCardsText (boolean showFirstHand) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < r�ka.size(); i++) {
			
			if (i == 0 && !showFirstHand) {
				sb.append("<br>[Ukryta]");
			} else {
				sb.append("<br>" + r�ka.get(i).toString());
			}
		}
		
		return sb.toString();
	}
	
	public String getCardsOnHand(boolean showFirstHand) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append(imi� + ":<br>");
		sb.append(getCardsText(showFirstHand) + "<br>");
		
		if (showFirstHand) {
			sb.append("Punkty: [" + getsumar�ki() + "] <br>");
		} else {
			sb.append("Punkty: [?] <br>");
		}
		
		sb.append("</html>");
		return sb.toString();
	
	}
	
	public boolean checkIfBusted() {
		
		if(getsumar�ki() < 22) {
			return false;
		} {
			return true;
		}
	
		
	}
}

