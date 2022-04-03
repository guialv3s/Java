package Basico;
import java.util.Locale;
import java.util.Scanner;

public class Valor_a_pagar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double valor = sc.nextDouble();
		
		int codigo2 = sc.nextInt();
		int quantidade2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		Double pagar = (quantidade * valor) + quantidade2 * valor2;
		
		System.out.printf("Valor a pagar: R$ %.2f", pagar);
		
		sc.close();
	}

}
