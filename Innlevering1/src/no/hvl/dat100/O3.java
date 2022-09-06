package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {

	public static void main(String[] args) {
		
		int n = parseInt(showInputDialog("n! når n er: "));
		int f = 1; 
		
		while(n < 1) {
		n = parseInt(showInputDialog("Ugyldig siffer. Prøv igjen: "));	
		}
		while(n >= 1) {
			f = f*n;
			n--;
		}
		System.out.println("Fakultet av valgt siffer: " + f);
	}
}
