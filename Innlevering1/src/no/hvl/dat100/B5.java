package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class B5 {

	public static void main(String[] args) {
		int poengSum;

		for (int i = 1; i <= 5; i++) {
			poengSum = parseInt(showInputDialog("Poengsum: "));

			while (poengSum < 0 || poengSum > 100) {
				poengSum = parseInt(showInputDialog("Ugyldig siffer. Prøv igjen: "));
			}

			String karakter = "";

			if (poengSum >= 90 && poengSum <= 100) {
				karakter = "Karakter: A";
			} else if (poengSum >= 80 && poengSum <= 89) {
				karakter = "Karakter: B";
			} else if (poengSum >= 60 && poengSum <= 79) {
				karakter = "Karakter: C";
			} else if (poengSum >= 50 && poengSum <= 59) {
				karakter = "Karakter: D";
			} else if (poengSum >= 40 && poengSum <= 49) {
				karakter = "Karakter: E";
			} else if (poengSum >= 0 && poengSum <= 39) {
				karakter = "Karakter: F";
			}

			System.out.println(karakter);
		}
	}
}