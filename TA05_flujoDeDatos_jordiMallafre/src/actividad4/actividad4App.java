package actividad4;

import javax.swing.JOptionPane;
public class actividad4App {

	public static void main(String[] args) {
		final double PI = 3.14;
		double radio = 0;
		double resultado = 0;
		String numero = JOptionPane.showInputDialog("Introduce el radio");
		
		radio = Double.parseDouble(numero);
		resultado = PI * Math.pow(radio, 2);
		
		JOptionPane.showMessageDialog(null,"El área del circulo es: " + resultado);

	}

}
