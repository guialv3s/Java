package While;
import java.util.Scanner;

public class Coordenadas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		while ( x != 0 && y != 0) {
			
			if ( x > 0 && y > 0 ) {
				System.out.print("Primeiro");
				x = 0;
		    }
			else if ( x < 0 && y > 0){
				System.out.println("Segundo");
				x = 0;
			}
			else if ( x < 0 && y < 0) {
				System.out.println("Terceiro");
				x = 0;
			}
			else if ( x > 0 && y < 0) {
				System.out.println("Quarto");
				x = 0;
			}
			    x = 0;
				System.out.println();
		}
		
		sc.close();
	}
}
	