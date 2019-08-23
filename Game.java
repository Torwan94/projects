package BlackJack;

import java.util.Scanner;

public class Game {
	
	Scanner scanner;
	talia talia;
	Gracz gracz;
	Gracz krupier;
	
	public Game() {
		
		scanner = new Scanner(System.in);
		talia = new talia();
		talia.wymieszaj();
		
		gracz = new Gracz("Gracz");
		krupier = new Gracz("Krupier");
		
	}
	
	public void runGame() {
		
		System.out.println("== Black Jack ==");
		System.out.println("by Pawe³ Nawrocki");
		
		gracz.addKartatorêka(talia.wezjednakarte());
		krupier.addKartatorêka(talia.wezjednakarte());
		
		System.out.println();
		
		boolean graczinGame = true;
		boolean krupierinGame = true;
		String answer;
		
		while (graczinGame || krupierinGame) {
			
			if(graczinGame) {
				
				System.out.println("Dobraæ kartê? (Wpisz T lub N)");
				answer = scanner.next();
				
				if(answer.compareToIgnoreCase("T") == 0) {
					
					System.out.println("\nDobierasz kartê \n");
					
					gracz.addKartatorêka(talia.wezjednakarte());
					graczinGame = !gracz.checkIfBusted();
				} else {
					
					System.out.println("\nNie dobierasz karty\n");
					graczinGame = false;
					
				}
					
			}
			
			if (krupierinGame) {
				
				if(krupier.getsumarêki() < 17) {
					
					System.out.println("\nKrupier dobiera kartê \n");
					krupier.addKartatorêka(talia.wezjednakarte());
					krupierinGame = !krupier.checkIfBusted();
					
				} else {
					System.out.println("\nKrupier nie dobiera karty \n");
					krupierinGame = false;
				}
			}
			
			
		}
		
		scanner.close();
		
		System.out.println("== Koniec gry ==");
		
		int sumagracza = gracz.getsumarêki();
		int sumakrupiera = krupier.getsumarêki();
		
		if (sumagracza > sumakrupiera && sumagracza<= 21 || sumakrupiera > 21) {
			System.out.println("WYGRANA!!!");
		} else {
			System.out.println("Krupier wygra³ :-(");
			
		}
		
		
		
	}

}
