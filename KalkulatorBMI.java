package KalkulatorBMI;
import java.util.Scanner;

public class KalkulatorBMI {
	
	public static void main (String[] args) {
		
		Scanner skan = new Scanner(System.in);  
		char m = 'm';
		char m2 = '"';
		char m3 = ':';
		System.out.print("Wpisz wzrost w " + m2+m+m2 + m3);
		double wzrost = skan.nextDouble();
		System.out.println("\nwzrost: " + wzrost + m);
		
		System.out.print("\nPodaj wagê: w kg: ");
		String kg = "kg";
		int waga = skan.nextInt();
		System.out.println("\nwaga: " + waga + kg);
		skan.close();
		
		int bmi = (int) (waga/(wzrost*wzrost));
		System.out.println("\nBMI: " + bmi);
		
		int niedowagamin = 16;
		int prawidlowamin = 18;
		int nadwagamin = 25;
		int otylosc1min = 30;
		int otylosc2min = 35;
		int otylosc3 = 40;
		
		if (bmi >= niedowagamin && bmi < prawidlowamin) {
			System.out.println("NIEDOWAGA!!!");
		}
		
		else if (bmi >= prawidlowamin && bmi < nadwagamin) {
			System.out.println("Wszystko spoko");
		}
		
		else if (bmi >= nadwagamin && bmi < otylosc1min) {
			System.out.println("Lekka nadwaga");
		}
		
		else if (bmi >= otylosc1min && bmi < otylosc2min) {
			System.out.println("OTY£OŒÆ I STOPNIA UWA¯AJ!!!");
		}
		
		else if (bmi >= otylosc2min && bmi < otylosc3) {
			System.out.println("OTY£OŒÆ II STOPNIA IDZ DO LEKARZA!!!");
		}
		
		else if (bmi >= otylosc3) {
			System.out.println("OTY£OŒÆ III STOPNIA JEDZ DO LEKARZA JU¯!!!!!");
		}
		
		else {
			System.out.println("Coœ posz³o nie tak lub nie ¿yjesz");
		}
		}
	

	}
	

