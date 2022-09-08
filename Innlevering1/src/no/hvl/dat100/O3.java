package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {

	public static void main(String[] args) {
		
		final int N = parseInt(showInputDialog("n! når n er: "));
		
		int n = N;
		int f = 1;
		
		if(n == 0) {
			f = 1;
		}
		while(n < 0) {
		n = parseInt(showInputDialog("Ugyldig siffer. Prøv igjen: "));	
		}
		
		System.out.print(N + "!");
		
		while(n >= 1) {
			f = f*n;
			n--;
			System.out.print(" = " + n+1 + "*");
		}
		System.out.println(" = " + f);
	}
}
