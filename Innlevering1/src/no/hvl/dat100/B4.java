package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class B4 {

	public static void main(String[] args) {
		
		String belop = showInputDialog("Bruttolønn: ");
		
		int bruttoLonn = parseInt(belop);
		
		double sats = 0;
		
		int trinn = 0;
		
		if (bruttoLonn <= 164100 ) {
			
		} else if (bruttoLonn >= 164101 && bruttoLonn <= 23950) {
			sats = 0.93;
			trinn = 1;
		} else if (bruttoLonn >= 23951 && bruttoLonn <= 580650) {
			sats = 2.41;
			trinn = 2;
		} else if (bruttoLonn >= 580651 && bruttoLonn <= 934050) {
			sats = 11.52;
			trinn = 3;
		} else if (bruttoLonn >= 934051) {
			sats = 14.52;
			trinn = 4;
		}
		
		System.out.println("Trinnskatt: " + trinn + " Sats: " + sats + "%");
		
	}

}
