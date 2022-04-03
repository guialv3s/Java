package IF_Else;
import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hi, hf, hora;
		hi = sc.nextInt();
		hf = sc.nextInt();
		
				
		if ( hi < hf ) {
			hora = hf - hi;
		}	
		else {
			hora = 24 - hi + hf;
		}
				System.out.println("O jogo durou " + hora + " hora(s)");
				
			
		sc.close();		
	}

}
