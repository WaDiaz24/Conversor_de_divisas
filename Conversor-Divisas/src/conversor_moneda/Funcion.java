package conversor_moneda;

import javax.swing.JOptionPane;

public class Funcion {
	ConvertirMonedas monedas = new ConvertirMonedas();

	public void convertirMonedas(double entrada) {
		String opcion = (JOptionPane.showInputDialog(null, "Elige la moneda a la que deseas convertir tu dinero",
				"Monedas", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen",
						"De Pesos a Won Coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos",
						"De Yen a Pesos", "De Won Coreano a Pesos" },
				"Seleccion")).toString();

		switch (opcion) {
		case "De Pesos a Dólar":
			monedas.converirPesosADolares(entrada);
			break;
		case "De Pesos a Euro":
			monedas.convertirPesoAEuro(entrada);
			break;
		case "De Pesos a Libras":
			monedas.convertirPesoALibras(entrada);
			break;
		case "De Pesos a Yen":
			monedas.convertirPesoAYen(entrada);
			break;
		case "De Pesos a Won Coreano":
			monedas.convertirPesoAWonCoreano(entrada);
			break;
		case "De Dólar a Pesos":
			monedas.convertirDolarAPesos(entrada);
			break;
		case "De Euro a Pesos":
			monedas.convertirEuroAPesos(entrada);
			break;
		case "De Libras a Pesos":
			monedas.convertirLibrasAPesos(entrada);
			break;
		case "De Yen a Pesos":
			monedas.convertirYenAPesos(entrada);
			break;
		case "De Won Coreano a Pesos":
			monedas.convertirWonCoreanoAPesos(entrada);
			break;
		}
	}
}
