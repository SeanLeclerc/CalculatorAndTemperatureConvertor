package lab01;

import javax.swing.*;

public class Convertisseur {
	public static void main(String[] args) {
		// Saisie de la temperature a convertir
		double temperature = Double.parseDouble(JOptionPane.showInputDialog("Entrez la temperature"));

		double Celsius = 9 / 5 * temperature + 32;
		double Fahrenheit = 5 / 9 * temperature - 32;
		System.out.printf("%1$1.1fC = %2$1.1fF\n", temperature, Celsius);
		System.out.printf("%1$1.1fF = %2$1.1fC\n", temperature, Fahrenheit);
	}
}
