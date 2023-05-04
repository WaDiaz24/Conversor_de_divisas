package Ventanas;

import javax.swing.JOptionPane;

import conversor_moneda.Funcion;
import conversor_temperatura.FuncionTemperatura;

public class Logica {
	public void menuOpciones() {
		Funcion monedas = new Funcion();
		FuncionTemperatura temperatura = new FuncionTemperatura();

		while (true) {
			String opciones = (JOptionPane
					.showInputDialog(null, "Seleccione una opción de conversión ", "MENU", JOptionPane.QUESTION_MESSAGE,
							null, new Object[] { "Conversor de Moneda", "Conversor temperatura"}, "Seleccion")
					).toString();

			switch (opciones) {
			case "Conversor de Moneda":
				String entrada = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir");
				if (validarNumero(entrada) == true) {
					double Minput = Double.parseDouble(entrada);
					monedas.convertirMonedas(Minput);

					int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opción Afirmativa");
					} else {
						JOptionPane.showMessageDialog(null, "Programa terminado");
						System.exit(respuesta);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				break;
			case "Conversor temperatura":
				entrada = JOptionPane.showInputDialog(null, "Ingresa el valor de la temperatura que deseas convertir");
				if (validarNumero(entrada) == true) {
					double Minput = Double.parseDouble(entrada);
					temperatura.convertirTemperatura(Minput);

					int respuesta = 0;
					respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
					if ((respuesta == 0) && (validarNumero(entrada) == true)) {

					} else {
						JOptionPane.showMessageDialog(null, "Programa terminado");
						System.exit(respuesta);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				break;
			}
			}
		}

	public static boolean validarNumero(String input) {
		try {
			double numero = Double.parseDouble(input);
			if (numero >= 0 || numero < 0)
				;
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
