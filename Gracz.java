package BlackJack;

import java.util.ArrayList;

public class Gracz {
	
	private String imiê;
	private ArrayList<Karta> rêka;
	
	public Gracz (String imiêgracza) {
		rêka = new ArrayList<>();
		imiê = imiêgracza;
	}
	
	public String getName() {
		return imiê;
	}
	
	public void addKartatorêka (Karta newKarta) {
		rêka.add(newKarta);
	}
	
	public int getsumarêki() {
		int sumapunktów = 0;
		int punktykarty;
		int iloœæasów = 0;
		
		for(int a = 0; a < rêka.size(); a++) {
			punktykarty = rêka.get(a) .wezwartoœækarty(). getwartoœci();
			
			if (punktykarty == 11) {
				iloœæasów++;
				sumapunktów += 11;
				
			} else {
				sumapunktów+= punktykarty;
			}
			
			while (sumapunktów > 21 && iloœæasów == 0) {
				sumapunktów -= 10;
				iloœæasów --;
				
			}
			
		}
		return sumapunktów;
	}
	
	
	public void printHand (boolean showFirstHand) {
		
		System.out.print(imiê + ":");
		System.out.println(getHandText(showFirstHand));
		
		if (showFirstHand) {
			System.out.println("Punkty: [" + getsumarêki() + "] \n");
		} else {
			System.out.println("Punkty: [?] \n");
		}
	}

	
	public String getHandText (boolean showFirstHand) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < rêka.size(); i++) {
			
			if (i == 0 && !showFirstHand) {
				sb.append("\n[Ukryta]");
			} else {
				sb.append("\n" + rêka.get(i).toString());
			}
		}
		
		return sb.toString();
	}
	
	public boolean checkIfBusted() {
		
		if(getsumarêki() < 22) {
			return false;
		} {
			return true;
		}
	}
}

