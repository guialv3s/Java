package IF_Else;
import java.util.Scanner;


public class Negativo_verdadeiro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;		
		x = sc.nextInt();
		
		if (x >= 0) {
			System.out.println("Não negativo.");
		}
		else {
			System.out.println("Negativo.");
		}
		
		sc.close();
	}

}
