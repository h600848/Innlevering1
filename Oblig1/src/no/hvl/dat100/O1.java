package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {
		String bruttoLonn = showInputDialog("Hva er din brutto lønn: ");
		int lonn = Integer.parseInt(bruttoLonn);
		
		double trinn1 = 0.0093;
		double trinn2 = 0.0241; 
		double trinn3 = 0.1152;
		double trinn4 = 0.1452; 
		
		if (lonn<0) {
			showMessageDialog(null, "Ugyldig brutto lønn, prøv på nytt.");	
		}
		else if (lonn>=0 && lonn <=164100) {
			showMessageDialog(null, "Du har ingen trinnskatt da din lønn er under 164 101 kr.");	
		}
		else if (lonn>=164101 && lonn <=230950) {
			showMessageDialog(null, "Ditt skattetrinn er trinn 1, du betaler kr " + lonn*trinn1 + " i trinnskatt.");	
		}
		else if (lonn>=230951 && lonn <=580650) {
			showMessageDialog(null, "Ditt skattetrinn er trinn 2, du betaler kr " + lonn*trinn2 + " i trinnskatt.");	
		}
		else if (lonn>=580651 && lonn <=934050) {
			showMessageDialog(null, "Ditt skattetrinn er trinn 3, du betaler kr " + lonn*trinn3 + " i trinnskatt.");	
		}
		else if (lonn>=934051) {
			showMessageDialog(null, "Ditt skattetrinn er trinn 4, du betaler kr " + lonn*trinn4 + " i trinnskatt.");	
		}
		 
		
		
	}

}
