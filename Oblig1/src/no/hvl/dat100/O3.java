package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class O3 {

	public static void main(String[] args) {
		
		int tall = parseInt(showInputDialog("Oppgi et heltall for å beregne fakultetet av tallet: "));
		int fakultet = 1; 
		
		if (tall <= 0) {
			showMessageDialog(null, "Ugyldig tall.");	
		} 
		else {
			for (int i = 1; i <= tall; i++) {
				fakultet *= i; 
			}
		
			showMessageDialog(null,"Fakultetet av " + tall + " = " + fakultet);
		}
	}
			
}
		
		
	


