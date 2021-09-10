package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class O2c {

	public static void main(String[] args) {

		for(int i = 1; i <= 10; i++) {
			
			boolean status = true; 
			while (status) {
				
				int poeng = parseInt(showInputDialog("Skriv inn poengsum: ")); 
				
				if (poeng>100) {
					showMessageDialog(null, "Ugyldig poengsum, prøv igjen!");
					continue; 
				}
				
				else if (poeng>=90) {
					showMessageDialog(null, "Student nummer " + i + ", du fikk karakter: A");
					status = false; 
				}
				
				else if (poeng>=80) {
					showMessageDialog(null, "Student nummer " + i + ", du fikk karakter: B");
					status = false; 
				}
				else if (poeng>=60) {
					showMessageDialog(null, "Student nummer " + i + ", du fikk karakter: C");
					status = false; 
				}
				else if (poeng>=50) {
					showMessageDialog(null, "Student nummer " + i + ", du fikk karakter: D");
					status = false; 
				}
				else if (poeng>=40) {
					showMessageDialog(null, "Student nummer " + i + ", du fikk karakter: E");
					status = false; 
				}
				else if (poeng<40 && poeng>0) {
					showMessageDialog(null, "Student nummer " + i + ", du fikk karakter: F");
					status = false; 
				}
				else {
					showMessageDialog(null, "Ugyldig poengsum, prøv igjen!");
					continue; 
				}
				
			}
		}

	}

}
