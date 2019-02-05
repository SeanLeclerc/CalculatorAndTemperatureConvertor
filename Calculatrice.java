package lab01;

//Sean Leclerc
//Date : 2016-09-12
//Fichier : PremierExemple.java

import javax.swing.*;

public class Calculatrice {
	public static void main(String[] args) {
		/*
		 * int n1 = Integer.parseInt(
		 * JOptionPane.showInputDialog(" Premiere operande :",0) ); int n2 =
		 * Integer.parseInt( JOptionPane.showInputDialog(
		 * "Deuxieme Operante ;",0) ); Systeme.out.println(n1 + " + "+ n2 " = "
		 * + (n1+n2));
		 */
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Premiere Operante :", 0));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Deuxieme Operante :", 0));
		System.out.printf("%1$1.4f + %2$1.4f = %3$1.4f\n", n1, n2, n1 + n2);
		System.out.printf("%1$1.4f - %2$1.4f = %3$1.4f\n", n1, n2, n1 - n2);
		System.out.printf("%1$1.4f x %2$1.4f = %3$1.4f\n", n1, n2, n1 * n2);
		System.out.printf("%1$1.4f / %2$1.4f = %3$1.4f\n", n1, n2, n1 / n2);
		System.out.printf("%1$1.4f %% %2$1.4f = %3$1.4f\n", n1, n2, n1 % n2);

	}
}
