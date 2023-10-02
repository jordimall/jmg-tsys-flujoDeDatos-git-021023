package actividad9;

public class actividad9App {

	public static void main(String[] args) {
		int numero = 1;
		int resultado_divisible_para_2 = 0;
		int resultado_divisible_para_3 = 0;
		
		while(numero <= 100) {
			resultado_divisible_para_2 = numero % 2;
			resultado_divisible_para_3 = numero % 3;
			if(resultado_divisible_para_2 == 0 || resultado_divisible_para_3 == 0) {
				System.out.println(numero);
			}
			numero++;
		}

	}

}
