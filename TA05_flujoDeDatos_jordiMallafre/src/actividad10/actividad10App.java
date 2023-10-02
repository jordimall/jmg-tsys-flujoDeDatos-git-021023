package actividad10;

import javax.swing.JOptionPane;
public class actividad10App {

	public static void main(String[] args) {
		int contador = 1;
		int num_ventas_A_introducir = 0;
		double numero_venta = 0;
		double numero_ventas_total = 0;
		String entrada_texto = JOptionPane.showInputDialog("Introduce el numero total de ventas");
		
		num_ventas_A_introducir = Integer.parseInt(entrada_texto);
		
		while(contador <= num_ventas_A_introducir) {
			entrada_texto = JOptionPane.showInputDialog("Introduce el valor de la venta " + contador);
			numero_venta = Double.parseDouble(entrada_texto);
			numero_ventas_total = numero_ventas_total + numero_venta;
			contador++;
		}
		
		JOptionPane.showMessageDialog(null, "El total de ventas ha sido: " + numero_ventas_total);
	}

}
