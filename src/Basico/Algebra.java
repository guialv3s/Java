package Basico;

import java.util.Locale;
import java.util.Scanner;


public class Algebra {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, tri, cir, tra, qua, ret;
		
		A = sc.nextDouble(); 
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		tri = (A * C) / 2.0;
		cir = 3.14159 * ( C * C );
		tra = ( A + B) / 2.0 * C;
		qua = B * B;
		ret = A * B;

		System.out.printf("Triangulo= %.3f%n" , tri);
		System.out.printf("Circulo= %.3f%n", cir);
		System.out.printf("Trapezio= %.3f%n", tra);
		System.out.printf("Quadrado= %.3f%n", qua);
		System.out.printf("Retangulo= %.3f%n", ret);
		sc.close();
	}

}
