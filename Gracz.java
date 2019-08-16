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
				sumapunkt�w+= punktykarty;
			}
			
			while (sumapunkt�w > 21 && ilo��as�w == 0) {
				sumapunkt�w -= 10;
				ilo��as�w --;
				
			}
			
		}
		return sumapunkt�w;
	}
	
	
	public void printHand (boolean showFirstHand) {
		
		System.out.print(imi� + ":");
		System.out.println(getHandText(showFirstHand));
		
		if (showFirstHand) {
			System.out.println("Punkty: [" + getsumar�ki() + "] \n");
		} else {
			System.out.println("Punkty: [?] \n");
		}
	}

	
	public String getHandText (boolean showFirstHand) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < r�ka.size(); i++) {
			
			if (i == 0 && !showFirstHand) {
				sb.append("\n[Ukryta]");
			} else {
				sb.append("\n" + r�ka.get(i).toString());
			}
		}
		
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

