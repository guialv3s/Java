package Basico;
import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero, horas;
		double hrstrabalho, salario;
		
		numero = sc.nextInt();
		horas = sc.nextInt();
		hrstrabalho = sc.nextDouble();
		salario = horas * hrstrabalho;
		
		System.out.println("Number = " + numero);
		System.out.printf("Salary = U$ %.2f" , salario);
		
		
		sc.close();
	}

}
