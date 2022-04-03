package While;
import java.util.Scanner;

public class Formula_Repetir {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();		
		int soma = 0;
		
		while ( x != 0 ) {
			soma = soma + x;
			x = sc.nextInt();
		}
		System.out.println("Soma total: " + soma);
		
		
		
		
		

		sc.close();
	}

}
