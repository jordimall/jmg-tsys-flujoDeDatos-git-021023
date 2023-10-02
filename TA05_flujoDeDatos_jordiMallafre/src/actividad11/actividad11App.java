package actividad11;

import javax.swing.JOptionPane;
public class actividad11App {

	public static void main(String[] args) {
		String dia_semana = JOptionPane.showInputDialog("Introduce un dia de la semana");
		switch (dia_semana.toUpperCase()) {
		case "LUNES":
			JOptionPane.showMessageDialog(null, "El " + dia_semana + " es dia laborable");	
			break;
		case "MARTES":
			JOptionPane.showMessageDialog(null, "El " + dia_semana + " es dia laborable");	
			break;
		case "MIERCOLES":
			JOptionPane.showMessageDialog(null, "El " + dia_semana + " es dia laborable");	
			break;
		case "JUEVES":
			JOptionPane.showMessageDialog(null, "El " + dia_semana + " es dia laborable");	
			break;
		case "VIERNES":
			JOptionPane.showMessageDialog(null, "El " + dia_semana + " es dia laborable");	
			break;
		case "SABADO":
			JOptionPane.showMessageDialog(null, "El " + dia_semana + " no es dia laborable");	
			break;
		case "DOMINGO":
			JOptionPane.showMessageDialog(null, "El " + dia_semana + " no es dia laborable");	
			break;
		default:
			JOptionPane.showMessageDialog(null, "No has introducido un dia correcto");	
			break;
		}

	}

}
