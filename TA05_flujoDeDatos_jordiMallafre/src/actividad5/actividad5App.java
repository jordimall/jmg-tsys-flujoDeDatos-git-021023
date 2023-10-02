package actividad5;

import javax.swing.JOptionPane;
public class actividad5App {

	public static void main(String[] args) {
		double numero = 0;
		double resultado = 0;
		String mensaje = "";
		String texto = JOptionPane.showInputDialog("Introduce un número");
		
		numero = Double.parseDouble(texto);
		resultado = numero % 2;
		
		if(resultado == 0) {
			mensaje = "El numero " + numero + " es divisible entre 2";
		} else {
			mensaje = "El numero " + numero + " no es divisible entre 2";
		}
		
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
