package actividad13;

import javax.swing.JOptionPane;
public class actividad13App {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		String signo_aritmetico = "";
		String entrada_texto = "";
		double resultado = 0;
		
		entrada_texto = JOptionPane.showInputDialog("Introduce un número entero");
		num1 = Integer.parseInt(entrada_texto);
		
		entrada_texto = JOptionPane.showInputDialog("Introduce un número entero");
		num2 = Integer.parseInt(entrada_texto);
		
		signo_aritmetico = JOptionPane.showInputDialog("Introduce uno de los siguientes simbolos arigmétios(Suma: +, Resta: -, Multiplicación: *, Division: /, elevar a: ^ o resta de la división %)");
		 
		switch (signo_aritmetico) {
		case "+":
			resultado = num1 + num2;
			JOptionPane.showMessageDialog(null, "El resultado de la suma entre " + num1 + " y " + num2 + " es: " + resultado);
			break;	
		case "-":
			resultado = num1 - num2;
			JOptionPane.showMessageDialog(null, "El resultado de la resta entre " + num1 + " y " + num2 + " es: " + resultado);
			break;
		case "*":
			resultado = num1 + num2;
			JOptionPane.showMessageDialog(null, "El resultado de la multiplicación entre " + num1 + " y " + num2 + " es: " + resultado);
			break;
		case "/":
			resultado = num1 + num2;
			JOptionPane.showMessageDialog(null, "El resultado de la división entre " + num1 + " y " + num2 + " es: " + resultado);
			break;
		case "^":
			resultado = Math.pow(num1, num2);
			JOptionPane.showMessageDialog(null, "El resultado de " + num1 + " elevado a " + num2 + " es: " + resultado);
			break;
		case "%":
			resultado = num1 % num2;
			JOptionPane.showMessageDialog(null, "La resta de la división entre " + num1 + " y " + num2 + "es: " + resultado);
			break;
		default:
			JOptionPane.showMessageDialog(null, "As de introducir uno de los simbolos arigmétios anteriormente mencionados");
			break;
		}

	}

}
