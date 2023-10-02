package actividad12;

import javax.swing.JOptionPane;
public class actividad12App {

	public static void main(String[] args) {
		String contraseña = "Contraseña";
		int count = 3;
		Boolean comprovante = false;
		String entrada_texto = "";
		do {
			entrada_texto = JOptionPane.showInputDialog("Introduce la contraseña (numero de intentos: " + count +")");
			if(contraseña.equals(entrada_texto)) {
				comprovante = true;
			}
			count--;
		} while(count > 0 && comprovante != true);

	}

}
