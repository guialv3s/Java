package IF_Else;
import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		
		if ( x < 0 ) {
			System.out.println("Fora de intervalo.");
		}
		else if ( x <= 25 ) {
			System.out.printf("Intervalo 0,25");
		}
		else if ( x <= 50) {
			System.out.printf("intervalo 25,50");
		}
		else if ( x <= 75) {
			System.out.printf("intervalo 50,75");	
		}
		else if ( x <= 100) {
			System.out.printf("intervalo 75,100");
		}
		else if ( x > 100) {
			System.out.printf("Fora de intervalo.");
		}
		
	sc.close();
	}
}
