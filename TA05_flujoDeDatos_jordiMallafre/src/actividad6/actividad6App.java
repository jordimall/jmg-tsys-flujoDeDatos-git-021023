package actividad6;

import javax.swing.JOptionPane;
public class actividad6App {

	public static void main(String[] args) {
		final double IVA = 0.21;
		double precio = 0;
		double precio_final = 0;
		String texto = JOptionPane.showInputDialog("Introduce un número");
		
		precio = Double.parseDouble(texto);
		precio_final = precio + (precio * IVA);
		
		JOptionPane.showMessageDialog(null, "El precio final del producto es: " + precio_final);

	}

}
