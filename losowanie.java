package losowanie;
import java.util.Random;


public class losowanie {
	
	public static void main (String[] args) {
		
		Random los = new Random();
		
		System.out.print("Twoje liczby to:\n");
		
		int c = 1;
		int w1 = los.nextInt(49);
		int w2 = los.nextInt(49);
		int w3 = los.nextInt(49);
		int w4 = los.nextInt(49);
		int w5 = los.nextInt(49);
		int w6 = los.nextInt(49);
		
			  System.out.println(c+w1);
			  System.out.println(c+w2);
			  System.out.println(c+w3);
			  System.out.println(c+w4);
			  System.out.println(c+w5);
			  System.out.println(c+w6);
		
		
		while(w1==w2 & w1==w3 & w1==w4 & w1==w5 & w1==w6 & w2==w3&w2==w4&w2==w5&w2==w6&w3==w4&w3==w5&w3==w6&w4==w5&w4==w6&w5==w6) {
			w1=los.nextInt(49);
			w2=los.nextInt(49);
			w3=los.nextInt(49);
			w4=los.nextInt(49);
			w5=los.nextInt(49);
			w6=los.nextInt(49);
			

		} 
		
		  
		  
	
	}

}
