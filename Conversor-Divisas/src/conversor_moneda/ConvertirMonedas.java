package conversor_moneda;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	public void converirPesosADolares(double valor) {
		double monedaDolar = valor /4640.00;
		monedaDolar = (double)Math.round(monedaDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiene $ "+monedaDolar+" Dolares");
	}
	public void convertirPesoAEuro(double valor) {
		double monedaEuro = valor/5128.42;
		monedaEuro = Math.round(monedaEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiene $ "+monedaEuro+" Euros");
	}
	public void convertirPesoALibras(double valor) {
		double monedaLibra = valor/5809.15;
		monedaLibra = Math.round(monedaLibra * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiene $ "+monedaLibra+" Libras");
	}
	public void convertirPesoAYen(double valor) {
		double monedaYen = valor/34.72;
		monedaYen = Math.round(monedaYen * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiene $ "+monedaYen+" Yenes");
	}
	public void convertirPesoAWonCoreano(double valor) {
		double monedaWon = valor/3.48;
		monedaWon = Math.round(monedaWon * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiene $ "+monedaWon+" Wones Coreanos");
	}
	public void convertirDolarAPesos(double valor) {
		double monedaPeso = valor/0.00022;
		monedaPeso = Math.round(monedaPeso * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiene $ "+monedaPeso+" Pesos");
	}
	public void convertirEuroAPesos(double valor) {
		double monedaPesoE = valor/0.00020;
		monedaPesoE = Math.round(monedaPesoE * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiene $ "+monedaPesoE+" Pesos");
	}
	public void convertirLibrasAPesos(double valor) {
		double monedaPesoL = valor/0.00017;
		monedaPesoL = Math.round(monedaPesoL * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiene $ "+monedaPesoL+" Pesos");
	}
	public void convertirYenAPesos(double valor) {
		double monedaPesoY = valor/0.029;
		monedaPesoY = Math.round(monedaPesoY * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiene $ "+monedaPesoY+" Pesos");
	}
	public void convertirWonCoreanoAPesos(double valor) {
		double monedaPesoW = valor/0.29;
		monedaPesoW = Math.round(monedaPesoW * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tiene $ "+monedaPesoW+" Pesos");
	}
}
