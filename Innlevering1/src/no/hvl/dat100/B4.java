package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class B4 {

	public static void main(String[] args) {
		
		String belop = showInputDialog("Bruttolønn: ");
		
		int bruttoLonn = parseInt(belop);
		
		double sats = 0;
		double sats_1 = 0.93;
		double sats_2 = 2.41;
		double sats_3 = 11.52;
		double sats_4 = 14.52;
		
		int trinn = 0;
		int trinn_1 = 1;
		int trinn_2 = 2;
		int trinn_3 = 3;
		int trinn_4 = 4;
		
		
		if (bruttoLonn <= 164100 ) {
			
		} else if (bruttoLonn >= 164101 && bruttoLonn <= 23950) {
			sats = sats_1;
			trinn = trinn_1;
		} else if (bruttoLonn >= 23951 && bruttoLonn <= 580650) {
			sats = sats_2;
			trinn = trinn_2;
		} else if (bruttoLonn >= 580651 && bruttoLonn <= 934050) {
			sats = sats_3;
			trinn = trinn_3;
		} else if (bruttoLonn >= 934051) {
			sats = sats_4;
			trinn = trinn_4;
		}
		
		System.out.println("Trinnskatt: " + trinn + " Sats: " + sats + "%");
		
	}

}
