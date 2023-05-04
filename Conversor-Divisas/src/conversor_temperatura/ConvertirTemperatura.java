package conversor_temperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
	public void gradosCelciusAFarenheit(double valor) {
		double farenheit = valor * 1.8 + 32;
		farenheit = (double) Math.round(farenheit * 100d)/100;
		JOptionPane.showMessageDialog(null, +valor+" Grados Celcius son "+farenheit+" Grados Farenheit");
	}

	public void gradosCelciusAKelvin(double valor) {
		double kelvin = valor + 273.15;
		kelvin = (double) Math.round(kelvin*100d)/100;
		JOptionPane.showMessageDialog(null, +valor+" Grados Celcius son "+kelvin+" Grados Kelvin");
	}

	public void gradosFarenheitACelcius(double valor) {
		double celcius = (valor - 32) / 1.8;
		celcius = (double) Math.round(celcius *100d)/100;
		JOptionPane.showMessageDialog(null, +valor+" Grados Farenheit son "+celcius+" Grados Celcius");
	}

	public void gradosKelvinACelcius(double valor) {
		double celciusKelvin = valor - 273.15;
		celciusKelvin = (double)Math.round(celciusKelvin * 100d)/100;
		JOptionPane.showMessageDialog(null, +valor+" Grados kelvin son "+celciusKelvin+" Grados Celcius");
	}

	public void gradosKelvinAFarenheit(double valor) {
		double farenheitKe = ((valor - 273.15)*1.8)+32;
		farenheitKe = (double) Math.round(farenheitKe*100d)/100;
		JOptionPane.showMessageDialog(null, +valor+" Grados Kelvin son "+farenheitKe+" Grados Farenheit");
	}

}
