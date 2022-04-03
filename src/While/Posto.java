package While;
import java.util.Scanner;

public class Posto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Álcool");
		System.out.println("2. Gasolina");
		System.out.println("3. Dielsel");
		System.out.println("4. Fim");
		
		int al = 0;
		int ga = 0;
		int di = 0;
		int cod = 0;
		
		while ( cod != 4) {
			cod = sc.nextInt();
			if (cod == 1){
				al = al + 1;
			}
			else if ( cod == 2) {
				ga = ga + 1;
			}	
			else if ( cod == 3)	{
				di = di + 1;
		
			}
		}
			
		System.out.println("Muito Obrigado");
		System.out.println("Álcool: " + al);
		System.out.println("Gasolina: " + ga);
		System.out.println("Diesel: " + di);
		
		
		
		sc.close();
	}

}
