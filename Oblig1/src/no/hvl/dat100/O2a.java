package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class O2a {

	public static void main(String[] args) {

		
				
				int poeng = parseInt(showInputDialog("Skriv inn poengsum: ")); 
				
				if (poeng>100) {
					showMessageDialog(null, "Ugyldig poengsum, prøv igjen!");
				}
				
				else if (poeng>=90) {
					showMessageDialog(null, "Du fikk karakter: A");
				}
				
				else if (poeng>=80) {
					showMessageDialog(null, "Du fikk karakter: B");
				}
				else if (poeng>=60) {
					showMessageDialog(null, "Du fikk karakter: C");
				}
				else if (poeng>=50) {
					showMessageDialog(null, "Du fikk karakter: D");
				}
				else if (poeng>=40) {
					showMessageDialog(null, "Du fikk karakter: E");
				}
				else if (poeng<40 && poeng>=0) {
					showMessageDialog(null, "Du fikk karakter: F"); 
				}
				else {
					showMessageDialog(null, "Ugyldig poengsum, prøv igjen!");
				}
				
			}

	}
