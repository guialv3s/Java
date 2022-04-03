package IF_Else;
import java.util.Scanner;

public class Lanchonete_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double codigo = sc.nextDouble();
		int quantidade = sc.nextInt();
		
		
		if ( codigo == 1 ) {
			double total = quantidade * 4.00; 
			System.out.printf("Total: R$%.2f", total);
		}
		else if ( codigo == 2 ) {
			double total = quantidade * 4.50;
			System.out.printf("Total: R$%.2f", total);
		}
			else if ( codigo == 3 ) {
				double total = quantidade * 5.00;
				System.out.printf("Total: R$%.2f", total);
		}
			else if ( codigo == 4 ) {
				double total = quantidade * 2.00;
				System.out.printf("Total: R$%.2f", total);
		}
			else if ( codigo == 5 ) {
				double total = quantidade * 1.50;
				System.out.printf("Total: R$%.2f", total);
	    }
			else {
				System.out.println("Codigo Invalido!");
			}
		sc.close();
	}

}
