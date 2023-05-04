package conversor_temperatura;

import javax.swing.JOptionPane;

public class FuncionTemperatura {
	ConvertirTemperatura temperatura = new ConvertirTemperatura();
	
	
	public void convertirTemperatura(double entrada) {
		String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin",
						"Grados Farenheit a Grados Celcius", "Kelvin a Grados Celcius", "Kelvin a Grados Farenheit" },
				"Seleccion")).toString();
		switch (opcion) {
		case "Grados Celcius a Grados Farenheit":
			temperatura.gradosCelciusAFarenheit(entrada);
			break;
		case "Grados Celcius a Kelvin":
			temperatura.gradosCelciusAKelvin(entrada);
			break;
		case "Grados Farenheit a Grados Celcius":
			temperatura.gradosFarenheitACelcius(entrada);
			break;
		case "Kelvin a Grados Celcius":
			temperatura.gradosKelvinACelcius(entrada);
			break;
		case "Kelvin a Grados Farenheit":
			temperatura.gradosKelvinAFarenheit(entrada);
			break;
		}
	}
}