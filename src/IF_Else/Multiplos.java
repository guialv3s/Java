package IF_Else;
import java.util.Scanner;


public class Multiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		int x, y;
		x= sc.nextInt();
		y = sc.nextInt();
		
		if ( x % y == 0 || y % x == 0 ) {
			System.out.println("S�o multiplos");
		}
		
		else {
			System.out.println("N�o s�o multiplos");
		}
		
		
		sc.close();
	}

}
